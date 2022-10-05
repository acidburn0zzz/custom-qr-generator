package com.github.alexzhirkevich.customqrgenerator.vector.style

import androidx.annotation.FloatRange

interface QrVectorBallShape : QrVectorShapeModifier {

    object Default : QrVectorBallShape, QrVectorShapeModifier by DefaultVectorShape

    data class Circle(
        @FloatRange(from = 0.0, to = 1.0) val size: Float
    ) : QrVectorBallShape, QrVectorShapeModifier by CircleVectorShape(size)

    data class RoundCorners(
        @FloatRange(from = 0.0, to = .5) val radius: Float
    ) : QrVectorBallShape, QrVectorShapeModifier by RoundCornersVectorShape(radius)
}