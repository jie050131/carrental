import Vue from 'vue'
import VueI18n from 'vue-i18n'
import enLocale from "./en";
import zhLocale from "./zh";
import elementEnLocale from 'element-ui/lib/locale/lang/en'
import elementZhLocale from 'element-ui/lib/locale/lang/zh-CN'

Vue.use(VueI18n)

const i18n=({
    locale: localStorage.lang || 'zh',

    messages: {
        en:{
            ...enLocale,
            ...elementEnLocale
        },
        zh:{
            ...zhLocale,
            ...elementZhLocale
        }
    }
})
export  default i18n