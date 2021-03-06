const collapse = {
    state: {
        isCollapse: false
    },
    mutations: {
        // 折叠侧边栏
        TOGGLE_SIDEBAR(state) {
            state.isCollapse = !state.isCollapse
            return state.isCollapse
        }
    },
    actions: {
        toggleSidebar({commit}) {
            commit('TOGGLE_SIDEBAR')
        }
    }
}

export default collapse