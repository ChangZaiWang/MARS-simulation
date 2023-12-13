package com.example.extra_points_questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import com.example.extra_points_questions.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var sec_A_q1_score = 0
        var sec_A_q2_score = 0
        var sec_A_q3_score = 0
        var sec_A_q4_score = 0
        var sec_A_q5_score = 0
        var sec_B_q6_score = 0
        var sec_B_q7_score = 0
        var sec_B_q8_score = 0
        var sec_B_q9_score = 0
        var sec_C_q10_score = 0
        var sec_C_q11_score = 0
        var sec_C_q12_score = 0
        var sec_D_q13_score = 0
        var sec_D_q14_score = 0
        var sec_D_q15_score = 0
        var sec_D_q16_score = 0
        var sec_D_q17_score = 0
        var sec_D_q18_score = 0
        var sec_D_q19_score = 0
        var sec_E_q20_score = 0
        var sec_E_q21_score = 0
        var sec_E_q22_score = 0
        var sec_E_q23_score = 0
        var sec_AD_score = 0

        fun score(checkedId: Int): Int {
            return when (checkedId) {
                R.id.radiobtn_sec_A_q1_o1 -> 1
                R.id.radiobtn_sec_A_q1_o2 -> 2
                R.id.radiobtn_sec_A_q1_o3 -> 3
                R.id.radiobtn_sec_A_q1_o4 -> 4
                R.id.radiobtn_sec_A_q1_o5 -> 5
                R.id.radiobtn_sec_A_q2_o1 -> 1
                R.id.radiobtn_sec_A_q2_o2 -> 2
                R.id.radiobtn_sec_A_q2_o3 -> 3
                R.id.radiobtn_sec_A_q2_o4 -> 4
                R.id.radiobtn_sec_A_q2_o5 -> 5
                R.id.radiobtn_sec_A_q3_o1 -> 1
                R.id.radiobtn_sec_A_q3_o2 -> 2
                R.id.radiobtn_sec_A_q3_o3 -> 3
                R.id.radiobtn_sec_A_q3_o4 -> 4
                R.id.radiobtn_sec_A_q3_o5 -> 5
                R.id.radiobtn_sec_A_q4_o1 -> 1
                R.id.radiobtn_sec_A_q4_o2 -> 2
                R.id.radiobtn_sec_A_q4_o3 -> 3
                R.id.radiobtn_sec_A_q4_o4 -> 4
                R.id.radiobtn_sec_A_q4_o5 -> 5
                R.id.radiobtn_sec_A_q5_o1 -> 1
                R.id.radiobtn_sec_A_q5_o2 -> 2
                R.id.radiobtn_sec_A_q5_o3 -> 3
                R.id.radiobtn_sec_A_q5_o4 -> 4
                R.id.radiobtn_sec_A_q5_o5 -> 5

                R.id.radiobtn_sec_B_q6_o1 -> 1
                R.id.radiobtn_sec_B_q6_o2 -> 2
                R.id.radiobtn_sec_B_q6_o3 -> 3
                R.id.radiobtn_sec_B_q6_o4 -> 4
                R.id.radiobtn_sec_B_q6_o5 -> 5
                R.id.radiobtn_sec_B_q7_o1 -> 1
                R.id.radiobtn_sec_B_q7_o2 -> 2
                R.id.radiobtn_sec_B_q7_o3 -> 3
                R.id.radiobtn_sec_B_q7_o4 -> 4
                R.id.radiobtn_sec_B_q7_o5 -> 5
                R.id.radiobtn_sec_B_q8_o1 -> 1
                R.id.radiobtn_sec_B_q8_o2 -> 2
                R.id.radiobtn_sec_B_q8_o3 -> 3
                R.id.radiobtn_sec_B_q8_o4 -> 4
                R.id.radiobtn_sec_B_q8_o5 -> 5
                R.id.radiobtn_sec_B_q9_o1 -> 1
                R.id.radiobtn_sec_B_q9_o2 -> 2
                R.id.radiobtn_sec_B_q9_o3 -> 3
                R.id.radiobtn_sec_B_q9_o4 -> 4
                R.id.radiobtn_sec_B_q9_o5 -> 5

                R.id.radiobtn_sec_C_q10_o1 -> 1
                R.id.radiobtn_sec_C_q10_o2 -> 2
                R.id.radiobtn_sec_C_q10_o3 -> 3
                R.id.radiobtn_sec_C_q10_o4 -> 4
                R.id.radiobtn_sec_C_q10_o5 -> 5
                R.id.radiobtn_sec_C_q11_o1 -> 1
                R.id.radiobtn_sec_C_q11_o2 -> 2
                R.id.radiobtn_sec_C_q11_o3 -> 3
                R.id.radiobtn_sec_C_q11_o4 -> 4
                R.id.radiobtn_sec_C_q11_o5 -> 5
                R.id.radiobtn_sec_C_q12_o1 -> 1
                R.id.radiobtn_sec_C_q12_o2 -> 2
                R.id.radiobtn_sec_C_q12_o3 -> 3
                R.id.radiobtn_sec_C_q12_o4 -> 4
                R.id.radiobtn_sec_C_q12_o5 -> 5

                R.id.radiobtn_sec_D_q13_o1 -> 1
                R.id.radiobtn_sec_D_q13_o2 -> 2
                R.id.radiobtn_sec_D_q13_o3 -> 3
                R.id.radiobtn_sec_D_q13_o4 -> 4
                R.id.radiobtn_sec_D_q13_o5 -> 5
                R.id.radiobtn_sec_D_q14_o1 -> 1
                R.id.radiobtn_sec_D_q14_o2 -> 2
                R.id.radiobtn_sec_D_q14_o3 -> 3
                R.id.radiobtn_sec_D_q14_o4 -> 4
                R.id.radiobtn_sec_D_q14_o5 -> 5
                R.id.radiobtn_sec_D_q15_o1 -> 1
                R.id.radiobtn_sec_D_q15_o2 -> 2
                R.id.radiobtn_sec_D_q15_o3 -> 3
                R.id.radiobtn_sec_D_q15_o4 -> 4
                R.id.radiobtn_sec_D_q15_o5 -> 5
                R.id.radiobtn_sec_D_q16_o1 -> 1
                R.id.radiobtn_sec_D_q16_o2 -> 2
                R.id.radiobtn_sec_D_q16_o3 -> 3
                R.id.radiobtn_sec_D_q16_o4 -> 4
                R.id.radiobtn_sec_D_q17_o5 -> 5
                R.id.radiobtn_sec_D_q17_o1 -> 1
                R.id.radiobtn_sec_D_q17_o2 -> 2
                R.id.radiobtn_sec_D_q17_o3 -> 3
                R.id.radiobtn_sec_D_q17_o4 -> 4
                R.id.radiobtn_sec_D_q17_o5 -> 5
                R.id.radiobtn_sec_D_q18_o1 -> 1
                R.id.radiobtn_sec_D_q18_o2 -> 2
                R.id.radiobtn_sec_D_q18_o3 -> 3
                R.id.radiobtn_sec_D_q18_o4 -> 4
                R.id.radiobtn_sec_D_q18_o5 -> 5
                R.id.radiobtn_sec_D_q19_o1 -> 1
                R.id.radiobtn_sec_D_q19_o2 -> 2
                R.id.radiobtn_sec_D_q19_o3 -> 3
                R.id.radiobtn_sec_D_q19_o4 -> 4
                R.id.radiobtn_sec_D_q19_o5 -> 5

                R.id.radiobtn_sec_E_q20_o1 -> 1
                R.id.radiobtn_sec_E_q20_o2 -> 2
                R.id.radiobtn_sec_E_q20_o3 -> 3
                R.id.radiobtn_sec_E_q20_o4 -> 4
                R.id.radiobtn_sec_E_q20_o5 -> 5
                R.id.radiobtn_sec_E_q21_o1 -> 1
                R.id.radiobtn_sec_E_q21_o2 -> 2
                R.id.radiobtn_sec_E_q21_o3 -> 3
                R.id.radiobtn_sec_E_q21_o4 -> 4
                R.id.radiobtn_sec_E_q21_o5 -> 5
                R.id.radiobtn_sec_E_q22_o1 -> 1
                R.id.radiobtn_sec_E_q22_o2 -> 3
                R.id.radiobtn_sec_E_q22_o3 -> 5
                R.id.radiobtn_sec_E_q23_o1 -> 1
                R.id.radiobtn_sec_E_q23_o2 -> 2
                R.id.radiobtn_sec_E_q23_o3 -> 3
                R.id.radiobtn_sec_E_q23_o4 -> 4
                R.id.radiobtn_sec_E_q23_o5 -> 5



                else -> 0
            }
        }

        fun calculateAverageA() {
            if (sec_A_q1_score != 0 && sec_A_q2_score != 0 && sec_A_q3_score != 0 && sec_A_q4_score != 0 && sec_A_q5_score != 0) {
                val averageScore = (sec_A_q1_score + sec_A_q2_score + sec_A_q3_score + sec_A_q4_score + sec_A_q5_score) / 5.0
                binding.txtSecAMeanScoreValue.text = averageScore.toString()
            }
            else {
                binding.txtSecAMeanScoreValue.text = null
            }
        }

        fun calculateAverageB() {
            if (sec_B_q6_score != 0 && sec_B_q7_score != 0 && sec_B_q8_score != 0 && sec_B_q9_score != 0) {
                val averageScore = (sec_B_q6_score + sec_B_q7_score + sec_B_q8_score + sec_B_q9_score) / 4.0
                binding.txtSecBMeanScoreValue.text = averageScore.toString()
            }
            else {
                binding.txtSecBMeanScoreValue.text = null
            }
        }

        fun calculateAverageC() {
            if (sec_C_q10_score != 0 && sec_C_q11_score != 0 && sec_C_q12_score != 0) {
                val averageScore = (sec_C_q10_score + sec_C_q11_score + sec_C_q12_score) / 3.0
                val df = DecimalFormat("#.##")
                val averageScore2String = df.format(averageScore).toString()
                binding.txtSecCMeanScoreValue.text = averageScore2String
            }
            else {
                binding.txtSecCMeanScoreValue.text = null
            }
        }

        fun calculateAverageD() {
            if (sec_D_q13_score != 0 && sec_D_q18_score != 0) {
                val averageScore = (sec_D_q13_score + sec_D_q14_score + sec_D_q15_score + sec_D_q16_score + sec_D_q17_score + sec_D_q18_score + sec_D_q19_score) / 7.0
                val df = DecimalFormat("#.##")
                val averageScore2String = df.format(averageScore).toString()
                binding.txtSecDMeanScoreValue.text = averageScore2String
            }
            else {
                binding.txtSecDMeanScoreValue.text = null
            }
        }

        fun calculateAverageE() {
            if (sec_E_q20_score != 0 && sec_E_q21_score != 0 && sec_E_q22_score != 0 && sec_E_q23_score != 0) {
                val averageScore = (sec_E_q20_score + sec_E_q21_score + sec_E_q22_score + sec_E_q23_score) / 4.0
                val df = DecimalFormat("#.##")
                val averageScore2String = df.format(averageScore).toString()
                binding.txtSecEMeanScoreValue.text = averageScore2String
            }
            else {
                binding.txtSecEMeanScoreValue.text = null
            }
        }

        fun calculateAverageAD() {
            val averageScore = (sec_A_q1_score + sec_A_q2_score + sec_A_q3_score + sec_A_q4_score + sec_A_q5_score + sec_B_q6_score + sec_B_q7_score + sec_B_q8_score + sec_B_q9_score + sec_C_q10_score + sec_C_q11_score + sec_C_q12_score + sec_D_q13_score + sec_D_q14_score + sec_D_q15_score + sec_D_q16_score + sec_D_q17_score + sec_D_q18_score + sec_D_q19_score) / 19
            val df = DecimalFormat("#.##")
            val averageScore2String = df.format(averageScore).toString()
            binding.txtSecADMeanScoreValue.text = averageScore2String
        }

        binding.radiogrpSecAQ1.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_A_q1_o1 -> {
                    binding.txtSecAQ1OptDesc.text = "Dull, not fun or entertaining at all"
                    sec_A_q1_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q1_o2 -> {
                    binding.txtSecAQ1OptDesc.text = "Mostly boring"
                    sec_A_q1_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q1_o3 -> {
                    binding.txtSecAQ1OptDesc.text = "OK, fun enough to entertain user for a brief time (< 5 minutes)"
                    sec_A_q1_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q1_o4 -> {
                    binding.txtSecAQ1OptDesc.text = "Moderately fun and entertaining, would entertain user for some time (5-10 minutes total)"
                    sec_A_q1_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q1_o5 -> {
                    binding.txtSecAQ1OptDesc.text = "Highly entertaining and fun, would stimulate repeat use"
                    sec_A_q1_score = score(checkedId)
                    calculateAverageA()
                }
            }
        }

        binding.radiogrpSecAQ2.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_A_q2_o1 -> {
                    binding.txtSecAQ2OptDesc.text = "Not interesting at all"
                    sec_A_q2_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q2_o2 -> {
                    binding.txtSecAQ2OptDesc.text = "Mostly uninteresting"
                    sec_A_q2_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q2_o3 -> {
                    binding.txtSecAQ2OptDesc.text = "OK, neither interesting nor uninteresting; would engage user for a brief time (< 5 minutes)"
                    sec_A_q2_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q2_o4 -> {
                    binding.txtSecAQ2OptDesc.text = "Moderately interesting; would engage user for some time (5-10 minutes total)"
                    sec_A_q2_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q2_o5 -> {
                    binding.txtSecAQ2OptDesc.text = "Very interesting, would engage user in repeat use"
                    sec_A_q2_score = score(checkedId)
                    calculateAverageA()
                }
            }
        }

        binding.radiogrpSecAQ3.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_A_q3_o1 -> {
                    binding.txtSecAQ3OptDesc.text = "Does not allow any customisation or requires setting to be input every time"
                    sec_A_q3_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q3_o2 -> {
                    binding.txtSecAQ3OptDesc.text = "Allows insufficient customisation limiting functions\n"
                    sec_A_q3_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q3_o3 -> {
                    binding.txtSecAQ3OptDesc.text = "Allows basic customisation to function adequately\n"
                    sec_A_q3_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q3_o4 -> {
                    binding.txtSecAQ3OptDesc.text = "Allows numerous options for customisation"
                    sec_A_q3_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q3_o5 -> {
                    binding.txtSecAQ3OptDesc.text = "Allows complete tailoring to the individual’s characteristics/preferences, retains all settings"
                    sec_A_q3_score = score(checkedId)
                    calculateAverageA()
                }
            }
        }

        binding.radiogrpSecAQ4.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_A_q4_o1 -> {
                    binding.txtSecAQ4OptDesc.text = "No interactive features and/or no response to user interaction"
                    sec_A_q4_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q4_o2 -> {
                    binding.txtSecAQ4OptDesc.text = "Insufficient interactivity, or feedback, or user input options, limiting functions"
                    sec_A_q4_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q4_o3 -> {
                    binding.txtSecAQ4OptDesc.text = "Basic interactive features to function adequately"
                    sec_A_q4_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q4_o4 -> {
                    binding.txtSecAQ4OptDesc.text = "Offers a variety of interactive features/feedback/user input options"
                    sec_A_q4_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q4_o5 -> {
                    binding.txtSecAQ4OptDesc.text = "Very high level of responsiveness through interactive features/feedback/user input options"
                    sec_A_q4_score = score(checkedId)
                    calculateAverageA()
                }
            }
        }

        binding.radiogrpSecAQ5.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_A_q5_o1 -> {
                    binding.txtSecAQ5OptDesc.text = "Completely inappropriate/unclear/confusing\n"
                    sec_A_q5_score = score(checkedId)
                    calculateAverageA()

                }
                R.id.radiobtn_sec_A_q5_o2 -> {
                    binding.txtSecAQ5OptDesc.text = "Mostly inappropriate/unclear/confusing"
                    sec_A_q5_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q5_o3 -> {
                    binding.txtSecAQ5OptDesc.text = "Acceptable but not targeted. May be inappropriate/unclear/confusing"
                    sec_A_q5_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q5_o4 -> {
                    binding.txtSecAQ5OptDesc.text = "Well-targeted, with negligible issues"
                    sec_A_q5_score = score(checkedId)
                    calculateAverageA()
                }
                R.id.radiobtn_sec_A_q5_o5 -> {
                    binding.txtSecAQ5OptDesc.text = "Perfectly targeted, no issues found"
                    sec_A_q5_score = score(checkedId)
                    calculateAverageA()
                }
            }
        }

        binding.radiogrpSecBQ6.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_B_q6_o1 -> {
                    binding.txtSecBQ6OptDesc.text = "App is broken; no/insufficient/inaccurate response (e.g. crashes/bugs/broken features, etc.)"
                    sec_B_q6_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q6_o2 -> {
                    binding.txtSecBQ6OptDesc.text = "Some functions work, but lagging or contains major technical problems"
                    sec_B_q6_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q6_o3 -> {
                    binding.txtSecBQ6OptDesc.text = "App works overall. Some technical problems need fixing/Slow at times"
                    sec_B_q6_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q6_o4 -> {
                    binding.txtSecBQ6OptDesc.text = "Mostly functional with minor/negligible problems"
                    sec_B_q6_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q6_o5 -> {
                    binding.txtSecBQ6OptDesc.text = "Perfect/timely response; no technical bugs found/contains a ‘loading time left’ indicator\n"
                    sec_B_q6_score = score(checkedId)
                    calculateAverageB()
                }
            }
        }

        binding.radiogrpSecBQ7.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_B_q7_o1 -> {
                    binding.txtSecBQ7OptDesc.text = "No/limited instructions; menu labels/icons are confusing; complicated"
                    sec_B_q7_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q7_o2 -> {
                    binding.txtSecBQ7OptDesc.text = "Useable after a lot of time/effort"
                    sec_B_q7_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q7_o3 -> {
                    binding.txtSecBQ7OptDesc.text = "Useable after some time/effort"
                    sec_B_q7_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q7_o4 -> {
                    binding.txtSecBQ7OptDesc.text = "Easy to learn how to use the app (or has clear instructions)"
                    sec_B_q7_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q7_o5 -> {
                    binding.txtSecBQ7OptDesc.text = "Able to use app immediately; intuitive; simple"
                    sec_B_q7_score = score(checkedId)
                    calculateAverageB()
                }
            }
        }

        binding.radiogrpSecBQ8.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_B_q8_o1 -> {
                    binding.txtSecBQ8OptDesc.text = "Different sections within the app seem logically disconnected and random/confusing/navigation is difficult"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q8_o2 -> {
                    binding.txtSecBQ8OptDesc.text = "Usable after a lot of time/effort"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q8_o3 -> {
                    binding.txtSecBQ8OptDesc.text = "Usable after some time/effort"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q8_o4 -> {
                    binding.txtSecBQ8OptDesc.text = "Easy to use or missing a negligible link"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q8_o5 -> {
                    binding.txtSecBQ8OptDesc.text = "Perfectly logical, easy, clear and intuitive screen flow throughout, or offers shortcuts\n"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
            }
        }

        binding.radiogrpSecBQ8.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_B_q8_o1 -> {
                    binding.txtSecBQ8OptDesc.text = "Different sections within the app seem logically disconnected and random/confusing/navigation is difficult"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q8_o2 -> {
                    binding.txtSecBQ8OptDesc.text = "Usable after a lot of time/effort"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q8_o3 -> {
                    binding.txtSecBQ8OptDesc.text = "Usable after some time/effort"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q8_o4 -> {
                    binding.txtSecBQ8OptDesc.text = "Easy to use or missing a negligible link"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q8_o5 -> {
                    binding.txtSecBQ8OptDesc.text = "Perfectly logical, easy, clear and intuitive screen flow throughout, or offers shortcuts"
                    sec_B_q8_score = score(checkedId)
                    calculateAverageB()
                }
            }
        }

        binding.radiogrpSecBQ9.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_B_q9_o1 -> {
                    binding.txtSecBQ9OptDesc.text = "Completely inconsistent/confusing"
                    sec_B_q9_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q9_o2 -> {
                    binding.txtSecBQ9OptDesc.text = "Often inconsistent/confusing"
                    sec_B_q9_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q9_o3 -> {
                    binding.txtSecBQ9OptDesc.text = "OK with some inconsistencies/confusing elements"
                    sec_B_q9_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q9_o4 -> {
                    binding.txtSecBQ9OptDesc.text = "Mostly consistent/intuitive with negligible problems"
                    sec_B_q9_score = score(checkedId)
                    calculateAverageB()
                }
                R.id.radiobtn_sec_B_q9_o5 -> {
                    binding.txtSecBQ9OptDesc.text = "Perfectly consistent and intuitive"
                    sec_B_q9_score = score(checkedId)
                    calculateAverageB()
                }
            }
        }

        binding.radiogrpSecCQ10.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_C_q10_o1 -> {
                    binding.txtSecCQ10OptDesc.text = "Very bad design, cluttered, some options impossible to select/locate/see/read device display not optimised"
                    sec_C_q10_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q10_o2 -> {
                    binding.txtSecCQ10OptDesc.text = "Bad design, random, unclear, some options difficult to select/locate/see/read"
                    sec_C_q10_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q10_o3 -> {
                    binding.txtSecCQ10OptDesc.text = "Satisfactory, few problems with selecting/locating/seeing/reading items or with minor screen size problems"
                    sec_C_q10_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q10_o4 -> {
                    binding.txtSecCQ10OptDesc.text = "Mostly clear, able to select/locate/see/read items"
                    sec_C_q10_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q10_o5 -> {
                    binding.txtSecCQ10OptDesc.text = "Professional, simple, clear, orderly, logically organised, device display optimised. Every design component has a purpose"
                    sec_C_q10_score = score(checkedId)
                    calculateAverageC()
                }
            }
        }

        binding.radiogrpSecCQ11.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_C_q11_o1 -> {
                    binding.txtSecCQ11OptDesc.text = "Graphics appear amateur, very poor visual design - disproportionate, completely stylistically inconsistent"
                    sec_C_q11_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q11_o2 -> {
                    binding.txtSecCQ11OptDesc.text = "Low quality/low resolution graphics; low quality visual design – disproportionate, stylistically inconsistent"
                    sec_C_q11_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q11_o3 -> {
                    binding.txtSecCQ11OptDesc.text = "Moderate quality graphics and visual design (generally consistent in style)"
                    sec_C_q11_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q11_o4 -> {
                    binding.txtSecCQ11OptDesc.text = "High quality/resolution graphics and visual design – mostly proportionate, stylistically consistent"
                    sec_C_q11_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q11_o5 -> {
                    binding.txtSecCQ11OptDesc.text = "Very high quality/resolution graphics and visual design - proportionate, stylistically consistent throughout"
                    sec_C_q11_score = score(checkedId)
                    calculateAverageC()
                }
            }
        }

        binding.radiogrpSecCQ12.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_C_q12_o1 -> {
                    binding.txtSecCQ12OptDesc.text = "No visual appeal, unpleasant to look at, poorly designed, clashing/mismatched colours"
                    sec_C_q12_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q12_o2 -> {
                    binding.txtSecCQ12OptDesc.text = "Little visual appeal – poorly designed, bad use of colour, visually boring"
                    sec_C_q12_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q12_o3 -> {
                    binding.txtSecCQ12OptDesc.text = "Some visual appeal – average, neither pleasant, nor unpleasant"
                    sec_C_q12_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q12_o4 -> {
                    binding.txtSecCQ12OptDesc.text = "High level of visual appeal – seamless graphics – consistent and professionally designed"
                    sec_C_q12_score = score(checkedId)
                    calculateAverageC()
                }
                R.id.radiobtn_sec_C_q12_o5 -> {
                    binding.txtSecCQ12OptDesc.text = "As above + very attractive, memorable, stands out; use of colour enhances app features/menus"
                    sec_C_q12_score = score(checkedId)
                    calculateAverageC()
                }
            }
        }

        binding.radiogrpSecDQ13.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_D_q13_o1 -> {
                    binding.txtSecDQ13OptDesc.text = "Misleading. App does not contain the described components/functions. Or has no description"
                    sec_D_q13_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q13_o2 -> {
                    binding.txtSecDQ13OptDesc.text = "Inaccurate. App contains very few of the described components/functions"
                    sec_D_q13_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q13_o3 -> {
                    binding.txtSecDQ13OptDesc.text = "OK. App contains some of the described components/functions"
                    sec_D_q13_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q13_o4 -> {
                    binding.txtSecDQ13OptDesc.text = "Accurate. App contains most of the described components/functions"
                    sec_D_q13_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q13_o5 -> {
                    binding.txtSecDQ13OptDesc.text = "Highly accurate description of the app components/functions"
                    sec_D_q13_score = score(checkedId)
                    calculateAverageD()
                }
            }
        }

        binding.radiogrpSecDQ14.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_D_q14_o1 -> {
                    binding.txtSecDQ14OptDesc.text = "App has no chance of achieving its stated goals"
                    sec_D_q14_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q14_o2 -> {
                    binding.txtSecDQ14OptDesc.text = "Description lists some goals, but app has very little chance of achieving them"
                    sec_D_q14_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q14_o3 -> {
                    binding.txtSecDQ14OptDesc.text = "OK. App has clear goals, which may be achievable."
                    sec_D_q14_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q14_o4 -> {
                    binding.txtSecDQ14OptDesc.text = "App has clearly specified goals, which are measurable and achievable"
                    sec_D_q14_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q14_o5 -> {
                    binding.txtSecDQ14OptDesc.text = "App has specific and measurable goals, which are highly likely to be achieved"
                    sec_D_q14_score = score(checkedId)
                    calculateAverageD()
                }
            }
        }

        binding.radiogrpSecDQ15.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_D_q15_o1 -> {
                    binding.txtSecDQ15OptDesc.text = "Irrelevant/inappropriate/incoherent/incorrect"
                    sec_D_q15_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q15_o2 -> {
                    binding.txtSecDQ15OptDesc.text = "Poor. Barely relevant/appropriate/coherent/may be incorrect"
                    sec_D_q15_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q15_o3 -> {
                    binding.txtSecDQ15OptDesc.text = "Moderately relevant/appropriate/coherent/and appears correct"
                    sec_D_q15_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q15_o4 -> {
                    binding.txtSecDQ15OptDesc.text = "Relevant/appropriate/coherent/correct\n"
                    sec_D_q15_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q15_o5 -> {
                    binding.txtSecDQ15OptDesc.text = "Highly relevant, appropriate, coherent, and correct"
                    sec_D_q15_score = score(checkedId)
                    calculateAverageD()
                }
            }
        }

        binding.radiogrpSecDQ16.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_D_q16_o1 -> {
                    binding.txtSecDQ16OptDesc.text = "Minimal or overwhelming"
                    sec_D_q16_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q16_o2 -> {
                    binding.txtSecDQ16OptDesc.text = "Insufficient or possibly overwhelming"
                    sec_D_q16_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q16_o3 -> {
                    binding.txtSecDQ16OptDesc.text = "OK but not comprehensive or concise"
                    sec_D_q16_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q16_o4 -> {
                    binding.txtSecDQ16OptDesc.text = "Offers a broad range of information, has some gaps or unnecessary detail; or has no links to more information and resources"
                    sec_D_q16_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q16_o5 -> {
                    binding.txtSecDQ16OptDesc.text = "Comprehensive and concise; contains links to more information and resources"
                    sec_D_q16_score = score(checkedId)
                    calculateAverageD()
                }
            }
        }

        binding.radiogrpSecDQ17.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_D_q17_o1 -> {
                    binding.txtSecDQ17OptDesc.text = "Completely unclear/confusing/wrong or necessary but missing"
                    sec_D_q17_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q17_o2 -> {
                    binding.txtSecDQ17OptDesc.text = "Mostly unclear/confusing/wrong"
                    sec_D_q17_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q17_o3 -> {
                    binding.txtSecDQ17OptDesc.text = "OK but often unclear/confusing/wrong"
                    sec_D_q17_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q17_o4 -> {
                    binding.txtSecDQ17OptDesc.text = "Mostly clear/logical/correct with negligible issues"
                    sec_D_q17_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q17_o5 -> {
                    binding.txtSecDQ17OptDesc.text = "Perfectly clear/logical/correct"
                    sec_D_q17_score = score(checkedId)
                    calculateAverageD()
                }
            }
        }

        binding.radiogrpSecDQ18.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_D_q18_o1 -> {
                    binding.txtSecDQ18OptDesc.text = "Source identified but legitimacy/trustworthiness of source is questionable (e.g. commercial business with vested interest)"
                    sec_D_q18_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q18_o2 -> {
                    binding.txtSecDQ18OptDesc.text = "Appears to come from a legitimate source, but it cannot be verified (e.g. has no webpage)"
                    sec_D_q18_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q18_o3 -> {
                    binding.txtSecDQ18OptDesc.text = "Developed by small NGO/institution (hospital/centre, etc.) /specialised commercial business, funding body"
                    sec_D_q18_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q18_o4 -> {
                    binding.txtSecDQ18OptDesc.text = "Developed by government, university or as above but larger in scale"
                    sec_D_q18_score = score(checkedId)
                    calculateAverageD()
                }
                R.id.radiobtn_sec_D_q18_o5 -> {
                    binding.txtSecDQ18OptDesc.text = "Developed using nationally competitive government or research funding (e.g. Australian Research Council, NHMRC)"
                    sec_D_q18_score = score(checkedId)
                    calculateAverageD()
                }
            }
        }

        binding.radiogrpSecDQ19.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_D_q19_o1 -> {
                    binding.txtSecDQ19OptDesc.text = "The evidence suggests the app does not work"
                    sec_D_q19_score = score(checkedId)
                    calculateAverageD()
                    calculateAverageAD()
                }
                R.id.radiobtn_sec_D_q19_o2 -> {
                    binding.txtSecDQ19OptDesc.text = "App has been trialled (e.g., acceptability, usability, satisfaction ratings) and has partially positive outcomes in studies that are not randomised controlled trials (RCTs), or there is little or no contradictory evidence."
                    sec_D_q19_score = score(checkedId)
                    calculateAverageD()
                    calculateAverageAD()
                }
                R.id.radiobtn_sec_D_q19_o3 -> {
                    binding.txtSecDQ19OptDesc.text = "App has been trialled (e.g., acceptability, usability, satisfaction ratings) and has positive outcomes in studies that are not RCTs, and there is no contradictory evidence."
                    sec_D_q19_score = score(checkedId)
                    calculateAverageD()
                    calculateAverageAD()
                }
                R.id.radiobtn_sec_D_q19_o4 -> {
                    binding.txtSecDQ19OptDesc.text = "App has been trialled and outcome tested in 1-2 RCTs indicating positive results"
                    sec_D_q19_score = score(checkedId)
                    calculateAverageD()
                    calculateAverageAD()
                }
                R.id.radiobtn_sec_D_q19_o5 -> {
                    binding.txtSecDQ19OptDesc.text = "App has been trialled and outcome tested in > 3 high quality RCTs indicating positive results"
                    sec_D_q19_score = score(checkedId)
                    calculateAverageD()
                    calculateAverageAD()
                }
            }
        }

        binding.radiogrpSecEQ20.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_E_q20_o1 -> {
                    binding.txtSecEQ20OptDesc.text = "I would not recommend this app to anyone"
                    sec_E_q20_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q20_o2 -> {
                    binding.txtSecEQ20OptDesc.text = "There are very few people I would recommend this app to"
                    sec_E_q20_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q20_o3 -> {
                    binding.txtSecEQ20OptDesc.text = "There are several people whom I would recommend it to"
                    sec_E_q20_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q20_o4 -> {
                    binding.txtSecEQ20OptDesc.text = "There are many people I would recommend this app to"
                    sec_E_q20_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q20_o5 -> {
                    binding.txtSecEQ20OptDesc.text = "I would recommend this app to everyone"
                    sec_E_q20_score = score(checkedId)
                    calculateAverageE()
                }
            }
        }

        binding.radiogrpSecEQ21.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_E_q21_o1 -> {
                    binding.txtSecEQ21OptDesc.text = "None"
                    sec_E_q21_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q21_o2 -> {
                    binding.txtSecEQ21OptDesc.text = "1-2"
                    sec_E_q21_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q21_o3 -> {
                    binding.txtSecEQ21OptDesc.text = "3-10"
                    sec_E_q21_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q21_o4 -> {
                    binding.txtSecEQ21OptDesc.text = "10-50"
                    sec_E_q21_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q21_o5 -> {
                    binding.txtSecEQ21OptDesc.text = ">50"
                    sec_E_q21_score = score(checkedId)
                    calculateAverageE()
                }
            }
        }

        binding.radiogrpSecEQ22.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_E_q22_o1 -> {
                    binding.txtSecEQ22OptDesc.text = "No"
                    sec_E_q22_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q22_o2 -> {
                    binding.txtSecEQ22OptDesc.text = "Maybe"
                    sec_E_q22_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q22_o3 -> {
                    binding.txtSecEQ22OptDesc.text = "Yes"
                    sec_E_q22_score = score(checkedId)
                    calculateAverageE()
                }
            }
        }

        binding.radiogrpSecEQ23.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobtn_sec_E_q23_o1 -> {
                    binding.txtSecEQ23OptDesc.text = "«\uF0AB"
                    sec_E_q23_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q23_o2 -> {
                    binding.txtSecEQ23OptDesc.text = "«\uF0AB«\uF0AB"
                    sec_E_q23_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q23_o3 -> {
                    binding.txtSecEQ23OptDesc.text = "«\uF0AB«\uF0AB«\uF0AB"
                    sec_E_q23_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q23_o4 -> {
                    binding.txtSecEQ23OptDesc.text = "«\uF0AB«\uF0AB«\uF0AB«\uF0AB"
                    sec_E_q23_score = score(checkedId)
                    calculateAverageE()
                }
                R.id.radiobtn_sec_E_q23_o5 -> {
                    binding.txtSecEQ23OptDesc.text = "«\uF0AB«\uF0AB«\uF0AB«\uF0AB«\uF0AB"
                    sec_E_q23_score = score(checkedId)
                    calculateAverageE()
                }
            }
        }



    }
}