/**
 * MIT License
 * 
 * Copyright (c) 2017 Lankheet Software and System Solutions
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lankheet.iot.datatypes;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A sensor is the origin of a measurement.<BR>
 * Currently, a sensor may be a combined sensor. We do not model this.<BR>
 * A measurement of different types can come from one sensor.
 */
@Entity
public class Sensor {

    @Id
    private int id;

    /** reference to SensorType.id */
    private Integer type;

    private String name;

    private String description;

    /** Default constructor required for JPA */
    public Sensor() {}

    public Sensor(Integer type, String name, String description) {
        super();
        this.type = type;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public SensorType getType() {
        return SensorType.getType(this.type);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
