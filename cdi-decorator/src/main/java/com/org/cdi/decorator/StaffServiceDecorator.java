/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.org.cdi.decorator;

import java.util.logging.Logger;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import com.org.cdi.interfaces.StaffService;
import com.org.cdi.pojo.Staff;

/**
 * CDI decorator class.
 * 
 * The {@link Decorator} qualifier tells CDI this is a decorator of the {@link com.org.cdi.interfaces.StaffService}.
 * 
 * We inject {@link com.org.cdi.interfaces.StaffService} and identify the delegate injection point of a decorator, using
 * {@link Delegate} annotation. By default decorators are disabled. So this class will not be touched. To activate
 * decorator, it must be specified in beans.xml descriptor.
 * 
 * @author Ievgen Shulga
 */
@Decorator
public abstract class StaffServiceDecorator implements StaffService {

    private final Logger log = Logger.getLogger(StaffServiceDecorator.class.getName());
    @Inject
    @Delegate
    private StaffService staffService;

    /**
     * We wrap {@link com.org.cdi.services.UIStaffService#getStaff()} method of delegate object and decorate it with
     * additional functionality. In this case after call to delegated method, we change {@link com.org.cdi.pojo.Staff}
     * attributes and log information.
     * 
     */
    @Override
    public Staff getStaff() {
        Staff staff = staffService.getStaff();
        staff.setBonus(200);
        staff.setPosition("Team Lead");
        log.info("CDI decorator method was called!");
        return staff;
    }

}
