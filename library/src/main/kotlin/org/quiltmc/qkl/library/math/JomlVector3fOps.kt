/*
 * DO NOT EDIT MANUALLY | THIS FILE WAS GENERATED BY https://github.com/SilverAndro/qkl_math_codegen
 *
 * Copyright 2023 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.qkl.library.math

import org.joml.Vector3f
import kotlin.math.sqrt

//region Standard math operators
/**
 * Adds a [Vector3f] to a [Vector3f].
 */
public operator fun Vector3f.plus(other: Vector3f): Vector3f {
    return Vector3f(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vector3f] from a [Vector3f].
 */
public operator fun Vector3f.minus(other: Vector3f): Vector3f {
    return Vector3f(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vector3f] and a [Vector3f].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun Vector3f.times(other: Vector3f): Vector3f {
    return Vector3f(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Negates a [Vector3f].
 */
public operator fun Vector3f.unaryMinus(): Vector3f {
    return Vector3f(
        -this.x,
        -this.y,
        -this.z
    )
}
//endregion

//region Vector specific operators
/**
 * Returns the normalized version of this vector.
 */
public fun Vector3f.normalized(): Vector3f {
    val length = sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z).toDouble())
    return Vector3f(
        (this.x / length).toFloat(),
        (this.y / length).toFloat(),
        (this.z / length).toFloat()
    )
}

/**
 * The [`x`][Vector3f.x] of a [Vector3f].
 */
public operator fun Vector3f.component1(): Float {
    return this.x
}

/**
 * The [`y`][Vector3f.y] of a [Vector3f].
 */
public operator fun Vector3f.component2(): Float {
    return this.y
}

/**
 * The [`z`][Vector3f.z] of a [Vector3f].
 */
public operator fun Vector3f.component3(): Float {
    return this.z
}

/**
 * Returns the dot product of a [Vector3f] and a [Vector3f].
 */
public infix fun Vector3f.dot(other: Vector3f): Float {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the cross product of a [Vector3f] and a [Vector3f].
 */
public infix fun Vector3f.cross(other: Vector3f): Vector3f {
    return Vector3f(
        (this.y * other.z) - (this.z * other.y),
        (this.z * other.x) - (this.x * other.z),
        (this.x * other.y) - (this.y * other.x),
    )
}
//endregion
