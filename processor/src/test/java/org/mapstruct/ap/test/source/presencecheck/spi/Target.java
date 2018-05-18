/**
 *  Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.test.source.presencecheck.spi;

import java.util.List;

/**
 * @author Sean Huang
 */
public class Target {

    private double somePrimitiveDouble;
    private Integer someInteger;
    private List<String> someList;
    private String[] someArray;

    private boolean hasSomePrimitiveDouble = false;
    private boolean hasSomeInteger = false;
    private boolean hasSomeList = false;
    private boolean hasSomeArray = false;

    public double getSomePrimitiveDouble() {
        return somePrimitiveDouble;
    }

    public void setSomePrimitiveDouble(double someDouble) {
        this.somePrimitiveDouble = someDouble;
        hasSomePrimitiveDouble = true;
    }

    public Integer getSomeInteger() {
        return someInteger;
    }

    public void setSomeInteger(Integer someInteger) {
        this.someInteger = someInteger;
        hasSomeInteger = true;
    }

    public List<String> getSomeList() {
        return someList;
    }

    public void setSomeList(List<String> someList) {
        this.someList = someList;
        hasSomeList = true;
    }

    public String[] getSomeArray() {
        return someArray;
    }

    public void setSomeArray(String[] someArray) {
        this.someArray = someArray;
        hasSomeArray = true;
    }

    public boolean hasSomePrimitiveDouble() {
        return hasSomePrimitiveDouble;
    }

    public boolean hasSomeInteger() {
        return hasSomeInteger;
    }

    public boolean hasSomeList() {
        return hasSomeList;
    }

    public boolean hasSomeArray() {
        return hasSomeArray;
    }

}
