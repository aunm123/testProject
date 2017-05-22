/**
 * Created by timhuo on 2017/5/17.
 */

$(function(){
    $.ajax({
        type:"GET",
        url:"data/menu.json",
        dataType:"json",
        success:function (data) {
            var cmenus = [];
            var select = true;
            data.forEach(function (dic) {
                var newMeum = {
                    title:dic.title,
                    content:"<div id='tcid"+dic.cid+"' />",
                    selected:select,
                    iconCls:dic.icon
                };
                select = false;
                $('#accordion').accordion('add',newMeum);

                dic.child.forEach(function (cdic) {
                    var newCmeum = {
                        text:cdic.title,
                        iconCls:cdic.icon,
                        attributes:{
                            url:cdic.html
                        }
                    };
                    cmenus.push(newCmeum);
                });

                $("#tcid"+dic.cid).tree({
                    data: cmenus,
                    onSelect: function (target) {
                        if ($('#tabs').tabs('exists',target.text)){
                            $('#tabs').tabs('select',target.text);
                        }else {
                            $('#tabs').tabs('add',{
                                title:target.text,
                                href:target.attributes.url,
                                closable:true
                            });
                        }

                    }
                });

                cmenus = [];
            })
        }
    });
});
