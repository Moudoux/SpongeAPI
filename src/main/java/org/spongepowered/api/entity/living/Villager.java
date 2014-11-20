/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api.entity.living;

import org.spongepowered.api.entity.living.villager.Career;

/**
 * Represents a Villager.
 */
public interface Villager extends Ageable {

    /**
     * Checks if this villager is currently playing with other child
     * villagers. This normally only applies to children villagers.
     *
     * @return true if this villager is playing with other children
     */
    boolean isPlaying();

    /**
     * Returns true if this villager is currently trading with another {@link
     * HumanEntity}. A villager is normally unable to trade with multiple
     * HumanEntities at the same time.
     *
     * @return true if this villager is trading with another player
     */
    boolean isTrading();

    /**
     * Gets the current career of this villager.
     *
     * @return the current career of this villager
     */
    Career getCareer();

    /**
     * Sets the current career of this villager.
     * <p>Setting the career of a villager may affect the trade offers
     * this villager can give to other human entities. Likewise, this may
     * change the rendering color of this villager.</p>
     *
     * @param career the career to set
     */
    void setCareer(Career career);

}
