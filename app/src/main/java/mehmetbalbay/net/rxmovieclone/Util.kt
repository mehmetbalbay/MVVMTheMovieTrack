package mehmetbalbay.net.rxmovieclone

import android.util.Log

infix fun String.logError(className: String){
    Log.e(className, this)
}