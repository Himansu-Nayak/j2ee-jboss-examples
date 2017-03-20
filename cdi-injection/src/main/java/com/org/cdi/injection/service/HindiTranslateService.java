package com.org.cdi.injection.service;

import com.org.cdi.injection.interfaces.TranslateService;
import com.org.cdi.injection.qualifier.Hindi;

/**
 * A simple implementation for the Hindi language.
 *
 * The {@link Hindi} qualifier tells CDI this is a special instance of the
 * {@link com.org.cdi.injection.interfaces.TranslateService}.
 *
 * @author Himansu Nayak
 *
 */
@Hindi
public class HindiTranslateService implements TranslateService {

    @Override
    public String hello() {
        return "namaste";
    }
}
