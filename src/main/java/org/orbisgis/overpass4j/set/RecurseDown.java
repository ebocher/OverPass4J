/*
 * This file is part of the OverPass4J library.
 *
 * OverPass4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OverPass4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OverPass4J. If not, see <http://www.gnu.org/licenses/>.
 */
package org.orbisgis.overpass4j.set;

/**
 * @author Sylvain PALOMINOS (UBS 2018)
 * @author Erwan Bocher (CNRS)
 */
public class RecurseDown extends SubSet {

    private String inputSetAlias;

    public RecurseDown() {}

    public RecurseDown(String inputSetAlias) {
        this.inputSetAlias = inputSetAlias;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if(inputSetAlias != null){
            str.append(".").append(inputSetAlias);
        }
        str.append(">");
        if(alias != null){
            str.append("->.");
            str.append(alias);
        }
        str.append(";");
        return str.toString();
    }

    public RecurseDown call(){
        return new RecurseDown();
    }

    public RecurseDown call(String inputSetAlias){
        return new RecurseDown(inputSetAlias);
    }
}
