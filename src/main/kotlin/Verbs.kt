import kotlinx.serialization.*

@Serializable

class Verbs: Word {
    var mothertongueTranslation: String
    var learningLanguageTranslation: String
    var wordType: String

    constructor(mothertongueTranslation: String,
                learningLanguageTranslation: String,
                wordType: String = "Verb",
                timesCalled: Int = 0,
                timesRight: Int = 0,
                slidingWindowList: MutableList<Int> = mutableListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                confidence: Int = 0
    ): super(timesCalled, timesRight, slidingWindowList, confidence){
        this.mothertongueTranslation = mothertongueTranslation
        this.learningLanguageTranslation = learningLanguageTranslation
        this. wordType = "Verb"
        this.timesCalled = timesCalled
        this.timesRight = timesRight
        this.slidingWindowList = slidingWindowList
        this.confidence = confidence
    }

    override fun toString(): String {
        return this.mothertongueTranslation
    }
}