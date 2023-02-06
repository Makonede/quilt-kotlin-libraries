/*
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

import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec3i
import org.joml.Vector3i
import kotlin.math.sqrt

//region Standard math operators
/**
 * Adds a [BlockPos] to a [BlockPos].
 */
public operator fun BlockPos.plus(other: BlockPos): BlockPos {
    return BlockPos(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [BlockPos] from a [BlockPos].
 */
public operator fun BlockPos.minus(other: BlockPos): BlockPos {
    return BlockPos(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [BlockPos] and a [BlockPos].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun BlockPos.times(other: BlockPos): BlockPos {
    return BlockPos(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Negates a [BlockPos].
 */
public operator fun BlockPos.unaryMinus(): BlockPos {
    return BlockPos(
        -this.x,
        -this.y,
        -this.z
    )
}
//endregion

//region Type compatibility operator variations
/**
 * Adds a [Vector3i] to a [BlockPos].
 */
public operator fun BlockPos.plus(other: Vector3i): BlockPos {
    return BlockPos(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vector3i] from a [BlockPos].
 */
public operator fun BlockPos.minus(other: Vector3i): BlockPos {
    return BlockPos(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vector3i] and a [BlockPos].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun BlockPos.times(other: Vector3i): BlockPos {
    return BlockPos(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}

/**
 * Adds a [Vec3i] to a [BlockPos].
 */
public operator fun BlockPos.plus(other: Vec3i): BlockPos {
    return BlockPos(
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
    )
}

/**
 * Subtracts a [Vec3i] from a [BlockPos].
 */
public operator fun BlockPos.minus(other: Vec3i): BlockPos {
    return BlockPos(
        this.x - other.x,
        this.y - other.y,
        this.z - other.z
    )
}

/**
 * Multiplies a [Vec3i] and a [BlockPos].
 * This method is a shorthand for component wise multiplication.
 */
public operator fun BlockPos.times(other: Vec3i): BlockPos {
    return BlockPos(
        this.x * other.x,
        this.y * other.y,
        this.z * other.z
    )
}
//endregion

//region Vector specific operators
/**
 * Divides a [BlockPos] and an Int.
 */
public operator fun BlockPos.div(other: Int): BlockPos {
    return BlockPos(
        this.x / other,
        this.y / other,
        this.z / other
    )
}

/**
 * Returns the normalized version of this vector.
 */
public fun BlockPos.normalized(): BlockPos {
    val length = sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z).toDouble())
    return BlockPos(
        (this.x / length).toInt(),
        (this.y / length).toInt(),
        (this.z / length).toInt()
    )
}

/**
 * The [`x`][BlockPos.x] of a [BlockPos].
 */
public operator fun BlockPos.component1(): Int {
    return this.x
}

/**
 * The [`y`][BlockPos.y] of a [BlockPos].
 */
public operator fun BlockPos.component2(): Int {
    return this.y
}

/**
 * The [`z`][BlockPos.z] of a [BlockPos].
 */
public operator fun BlockPos.component3(): Int {
    return this.z
}

/**
 * Returns the dot product of a [BlockPos] and a [Vector3i].
 */
public infix fun BlockPos.dot(other: Vector3i): Int {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the dot product of a [BlockPos] and a [Vec3i].
 */
public infix fun BlockPos.dot(other: Vec3i): Int {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the dot product of a [BlockPos] and a [BlockPos].
 */
public infix fun BlockPos.dot(other: BlockPos): Int {
    return (this.x * other.x) + (this.y * other.y) + (this.z * other.z)
}

/**
 * Returns the cross product of a [BlockPos] and a [Vector3i].
 */
public infix fun BlockPos.cross(other: Vector3i): BlockPos {
    return BlockPos(
        (this.y * other.z) - (this.z * other.y),
        (this.z * other.x) - (this.x * other.z),
        (this.x * other.y) - (this.y * other.x),
    )
}

/**
 * Returns the cross product of a [BlockPos] and a [Vec3i].
 */
public infix fun BlockPos.cross(other: Vec3i): BlockPos {
    return BlockPos(
        (this.y * other.z) - (this.z * other.y),
        (this.z * other.x) - (this.x * other.z),
        (this.x * other.y) - (this.y * other.x),
    )
}

/**
 * Returns the cross product of a [BlockPos] and a [BlockPos].
 */
public infix fun BlockPos.cross(other: BlockPos): BlockPos {
    return BlockPos(
        (this.y * other.z) - (this.z * other.y),
        (this.z * other.x) - (this.x * other.z),
        (this.x * other.y) - (this.y * other.x),
    )
}
//endregion

//region Conversion methods
/**
 * Converts a [BlockPos] to a [Vector3i].
 */
public fun BlockPos.toVector3i(): Vector3i {
    return Vector3i(
        this.x,
        this.y,
        this.z
    )
}

/**
 * Converts a [BlockPos] to a [Vec3i].
 */
public fun BlockPos.toVec3i(): Vec3i {
    return Vec3i(
        this.x,
        this.y,
        this.z
    )
}
//endregion
