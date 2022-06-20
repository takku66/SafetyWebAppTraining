window.addEventListener("DOMContentLoaded", function(){

	const indexPage = new IndexPage();
	indexPage.init();
}, false);


/**
 *
 */
class IndexPage {

	// コンストラクタ
	constructor(){
		this.eventClassName = "js-link_list";
	}

	// 初期化処理
	init(){
		const linkElms = document.getElementsByClassName(this.eventClassName);
		for(let elm of linkElms){
			elm.addEventListener("click", function(){
				submitPage(this);
			}, false);
		}
	}

}

//ページ遷移処理
function submitPage(elm){
	const form = elm.closest("form");
	form.action = elm.dataset.actName;
	form.submit();
}
