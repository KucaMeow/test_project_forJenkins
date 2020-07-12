<!doctype html>
<html lang="en">
<head>
    <title>Test</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.10.2.js"
            type="text/javascript"></script>
</head>
<body>
<#include "header.ftlh"/>
<main>
    <div id="my_alerts" class="container">
<#--        NOT CORRECT-->
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
            <strong>Не правильно(</strong>
        </div>
<#--        CORRECT-->
        <div class="alert alert-success alert-dismissible fade show" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
            <strong>Правильно)</strong>
        </div>
    </div>
    <div id="carouselId" class="carousel slide" data-ride="false" data-wrap="false" data-interval="false">
        <ol class="carousel-indicators">
            <li data-target="#carouselId" data-slide-to="0" class="active"></li>
            <li data-target="#carouselId" data-slide-to="1"></li>
            <li data-target="#carouselId" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
<#--            CODE TASK-->
            <div class="carousel-item overflow-auto active">
                <div class="container-fluid">
                    <div class="col-8 mx-auto">
                        <div class="container">
                <pre id="task">
                    <div>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda, aut blanditiis deserunt dicta incidunt magnam molestiae mollitia natus quasi, quis reprehenderit saepe sequi suscipit temporibus totam velit voluptate voluptatum! Nulla!</div><div>Ab asperiores consequatur fuga in inventore nihil optio veniam. Amet, asperiores delectus dolores hic illo minus molestiae nemo nobis, quam quas quisquam sapiente sit vel. Inventore nam nemo quasi ullam?</div><div>Ab accusantium alias asperiores consequuntur deleniti dolorum expedita neque nesciunt officiis optio, pariatur quae quasi ratione reprehenderit sint tempora temporibus totam unde voluptates voluptatum. Aut cumque dolor excepturi praesentium voluptas!</div><div>Adipisci aliquam aliquid aspernatur atque aut corporis delectus dolorem dolores ea est et eum expedita impedit libero magnam natus nobis quaerat quasi qui quisquam repellat, soluta tempore ullam vel veritatis!</div><div>Ab, ad autem deleniti dolor doloremque exercitationem libero maiores nam non, numquam perferendis sit voluptatem. Amet cum dolor eaque eius, esse ex excepturi, fuga ipsa nisi officia omnis soluta velit?</div>
                </pre>
                        </div>
                        <#include "editor.ftlh"/>
                    </div>
                </div>
            </div>
<#--            LEARNING TEXT-->
            <div class="carousel-item overflow-auto">
                <div class="col-8 mx-auto">
                    <div class="container">
                <pre id="task">
                    <div>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet architecto atque cumque dolorem esse ex inventore ipsam magni molestias neque nesciunt non porro quia, repudiandae sapiente sed similique sunt velit.</div><div>Amet at commodi cum ea ex, ipsum magnam minima nesciunt odit quam quos rem rerum, soluta tempore veniam veritatis vitae. Architecto error exercitationem expedita magni nulla possimus provident quaerat soluta.</div><div>Dolore dolorum exercitationem explicabo qui repellat? Blanditiis dicta dolores fuga magnam numquam officia perspiciatis praesentium provident veniam vitae. Ab atque doloribus facilis fugiat necessitatibus porro praesentium quo rem repellendus suscipit.</div><div>Aliquam eveniet laboriosam maxime minima ratione repellat sint? At corporis distinctio eius enim fugit incidunt inventore iusto magnam necessitatibus officiis quidem quos repellendus, repudiandae sequi sint soluta tempora veritatis voluptate!</div><div>Nemo nulla odit officiis omnis praesentium quo unde voluptate! Autem beatae corporis, cum dolorem eaque esse eum eveniet explicabo hic illo ipsum, nam perferendis quisquam recusandae, similique sit vel voluptatum.</div><div>Commodi, dicta dolor ea enim, et fugit harum illum, iusto modi rerum soluta tenetur voluptatem voluptatum! Corporis doloribus facilis labore magni, necessitatibus nihil optio praesentium, quibusdam reiciendis rem saepe tempora!</div><div>Ex, omnis, suscipit? Ab accusamus aut deleniti dignissimos dolorem error excepturi facere fugiat hic laborum laudantium magnam magni minus nobis non nulla, officiis velit vitae. Doloribus esse quae veniam vero.</div><div>Aliquam aliquid cum cumque delectus eligendi eos exercitationem explicabo facilis fugit, magni neque nulla obcaecati officia officiis provident quas rerum sed tenetur, ullam veniam veritatis voluptatem, voluptates voluptatibus. Facere, optio.</div><div>Cumque deserunt iste laborum magnam? Adipisci aperiam debitis doloribus eveniet, expedita fugiat illum ipsam iste maxime minima nemo numquam officia perspiciatis, quis quos ratione rerum sapiente. Dolore quia veniam veritatis.</div><div>Mollitia, nisi, velit! Accusamus ad aspernatur atque consequatur cum, cumque deleniti deserunt error facere facilis fugit illum laborum necessitatibus nihil pariatur perspiciatis porro praesentium quae quis tenetur vel voluptatem voluptates.</div><div>Adipisci aut beatae consequatur consequuntur delectus distinctio dolorem eveniet facere fugiat illo in ipsum magni molestias necessitatibus nulla odit officia omnis pariatur perspiciatis placeat qui, quo ratione sequi vitae voluptate.</div><div>Alias autem dignissimos ducimus exercitationem laboriosam nihil nisi porro, provident recusandae tenetur! Accusantium commodi, doloremque error facilis impedit ipsa, maiores minima, natus nihil obcaecati quae voluptatem voluptatum. Dignissimos eum, ex?</div><div>A aliquam aliquid animi commodi cupiditate debitis dignissimos eius illum nulla optio, pariatur, praesentium quidem, ratione similique vitae? At cumque fugiat harum ipsa iste nisi qui quibusdam quis repellendus soluta?</div><div>Architecto aut dolores itaque minima natus tempore veniam? Aliquam aspernatur cum distinctio, eaque eius esse inventore quia reprehenderit suscipit voluptate? Debitis deleniti eius eligendi explicabo libero nihil quae sit ullam!</div><div>At corporis dignissimos error quod repudiandae, ut vitae. Accusamus, aperiam cum cupiditate distinctio dolorum earum error illum iure labore laborum maxime natus numquam odio officia praesentium quibusdam, rem saepe similique.</div><div>Blanditiis consequatur culpa cumque debitis doloribus fugit illo illum impedit ipsum laboriosam libero maiores nisi quae quam quas repudiandae sint, sunt voluptatem? Asperiores fugit officiis qui temporibus tenetur. Doloribus, quam?</div><div>Aspernatur distinctio dolor facilis magnam minus molestiae nostrum numquam optio, quod saepe sint, tenetur vero. Adipisci corporis delectus dolore doloremque fuga necessitatibus nemo ratione suscipit tempora vero. Et repudiandae, ullam!</div><div>Ab accusantium adipisci, alias amet, beatae, dignissimos earum eligendi eos esse expedita fugiat impedit iste itaque iusto laboriosam libero minima minus nihil quae quis reiciendis repudiandae rerum sapiente sit temporibus.</div><div>Atque in inventore laudantium molestiae natus nulla provident voluptas voluptatibus. Culpa error iusto maxime nisi quos ratione sequi temporibus. Adipisci, exercitationem nisi. A aliquam dolore enim hic laborum, quis similique?</div><div>Consectetur cumque excepturi non? Ad at, beatae debitis eaque eveniet exercitationem incidunt minus molestiae nisi obcaecati placeat tempore temporibus totam voluptas voluptates. Amet blanditiis error quod reprehenderit temporibus. Distinctio, in.</div><div>Assumenda autem dolorem incidunt soluta! Ab ea eligendi est exercitationem illo minus, nostrum obcaecati quis reprehenderit voluptates! A aliquam aspernatur deleniti dignissimos exercitationem facilis fugit ipsam, officiis tenetur ut voluptatem?</div><div>Adipisci aliquam aliquid eos error iusto libero molestias natus quod tenetur totam! Aut, autem consequuntur, dolore doloremque ea esse, eum id non numquam omnis quis rem unde? Iure quis, soluta!</div><div>Dignissimos dolore nostrum soluta! Ad aliquid asperiores aut commodi dolorem earum iste laboriosam laborum nihil nobis placeat sequi similique, sit suscipit temporibus! Accusamus maxime, molestiae porro quo ratione sapiente. Quas!</div><div>Consequuntur culpa debitis ea et fugiat modi sit tempora vitae! A adipisci animi consequuntur ex fuga illum in perspiciatis quibusdam quidem, quis quod quos repudiandae sit veritatis voluptate voluptatem voluptates!</div><div>A eligendi est fuga modi odio quibusdam quo vero vitae! Adipisci asperiores aspernatur blanditiis deserunt exercitationem fugiat iste labore molestias nobis non, quaerat quo reiciendis sint soluta, tempora vero, voluptatum.</div><div>A accusantium architecto atque beatae cum delectus dolorum eos esse est hic inventore iste libero minima, nesciunt nisi officiis optio porro qui quis repudiandae sapiente similique sunt tenetur, unde, veritatis!</div><div>A adipisci alias aperiam aspernatur consequuntur debitis dolorem doloremque eaque earum enim ex expedita fugiat, harum iste nemo quasi quis quo sequi sunt suscipit tempora tenetur voluptate voluptatem? Cum, nisi?</div><div>Accusantium aliquam, blanditiis deserunt ducimus, eaque eum ex exercitationem, expedita harum incidunt modi nam natus pariatur possimus provident quos reprehenderit sequi veniam voluptate voluptatum? Accusantium iusto laboriosam magni similique soluta.</div><div>A ad asperiores aspernatur culpa deleniti deserunt dolorum, eum expedita fuga iusto odio quaerat reprehenderit sunt ut voluptatum. At, ipsum nihil pariatur quis temporibus ut! Accusantium atque fugit sequi totam.</div><div>Ad atque commodi dolorum illum nesciunt nostrum recusandae. Consequatur ea fugiat necessitatibus quam quo saepe temporibus? Ad adipisci commodi inventore iure nihil, nisi quo, recusandae repudiandae rerum sed sint veritatis!</div><div>Accusamus alias modi odit optio possimus quaerat, quis velit voluptate. Accusamus commodi debitis, dicta dolorem dolores ducimus ea eligendi, magni nemo nihil nulla porro quia quidem quisquam rem sed soluta.</div><div>Architecto consequatur ex harum in ipsam laborum minus nihil similique. Ab aperiam, atque cupiditate est fuga ipsa iste molestiae nihil quod sed, tempore unde, veritatis vero. Consequatur ea neque omnis!</div><div>Ad aliquam aliquid aperiam culpa deleniti, dolor enim exercitationem iste labore laboriosam molestias necessitatibus non officiis qui repudiandae tempore vel, vero. Accusamus ducimus eligendi et fugit iusto quidem ratione sint?</div><div>Ab architecto eos in, officia porro quaerat quia sunt vero. Amet consequatur consequuntur dolore esse expedita facere hic ipsum labore libero magni nemo, quos rerum sapiente similique ullam unde voluptatem!</div><div>Accusantium amet architecto asperiores at, debitis dignissimos earum eligendi expedita facere harum illo ipsa iste laborum laudantium molestiae odit pariatur quidem, quo repellat reprehenderit tenetur veniam vero voluptate. Distinctio, porro.</div><div>Dicta eius explicabo id, maxime omnis porro quam? Ad architecto, cupiditate deserunt dicta earum eveniet in laudantium, nostrum numquam officiis praesentium provident quae quas ratione repellendus rerum voluptate. Autem, eius.</div><div>Adipisci architecto consectetur corporis eligendi error esse, eveniet ex harum iste modi odio odit optio porro possimus rem sed similique. Ab eos fugiat, ipsam magni reprehenderit sed. Alias, provident, tempora.</div><div>Ad ipsa, nesciunt. Accusamus alias aspernatur eaque excepturi, id in laudantium, natus odit repellendus sunt tenetur vel veritatis voluptate voluptatem voluptatum. Asperiores at cupiditate laudantium minima quibusdam quidem ratione sint!</div><div>Autem deserunt eligendi, exercitationem inventore iste, maiores nobis omnis repellendus reprehenderit velit voluptas voluptate voluptates! Enim eum explicabo illum modi nesciunt nobis pariatur, sequi ullam vitae. Earum harum nisi quis.</div><div>A ab, beatae, cum dicta enim est explicabo fuga magnam maxime odit officiis perspiciatis quidem rerum similique sit tenetur velit. Harum quia, vel. Eligendi esse illum neque quasi recusandae voluptate!</div><div>Accusantium, dicta dolor enim ex illum molestiae mollitia reiciendis rem, repudiandae sapiente soluta vero voluptates! Adipisci, dignissimos facere harum in itaque iusto nemo similique tempora vero? Cupiditate dolorum ducimus optio?</div><div>Aperiam, aspernatur at, blanditiis, consequatur doloremque eaque eligendi esse explicabo laudantium molestiae mollitia nihil quisquam quod quos veniam! Ab cum facere id itaque omnis perferendis porro rem ullam veritatis voluptatibus.</div><div>Accusantium debitis dolor explicabo iste, minus modi nisi quas suscipit. Aliquid dicta dolores itaque iure mollitia? Enim excepturi exercitationem inventore maiores, obcaecati tempora veritatis. Architecto cupiditate harum ipsam nam quod?</div><div>Aliquam autem cum distinctio dolore dolorum eaque et eum facere illo ipsa maiores minus nesciunt non obcaecati odit officiis, praesentium quasi repellendus repudiandae sit totam voluptate voluptatum! Cum maxime, voluptates.</div><div>Et inventore labore nemo officia quod. Cupiditate dolorum ducimus maxime minima perspiciatis porro sapiente! Accusamus cupiditate dicta dignissimos doloribus esse expedita natus non, placeat quisquam reprehenderit saepe similique tempora voluptate!</div><div>Asperiores atque corporis dolorem dolores harum illo incidunt ipsam ipsum iste magnam neque nisi odit omnis pariatur quis, quisquam recusandae, reiciendis repellendus similique soluta suscipit tempora vitae. Error, pariatur possimus.</div><div>Aliquam asperiores at doloribus rerum veniam. Ad adipisci commodi dolores doloribus et hic ipsam iste libero nulla, praesentium quam recusandae repellat, rerum sequi tempore. At earum laboriosam nulla quisquam sit?</div><div>A adipisci aliquam amet aperiam aspernatur assumenda blanditiis ducimus enim eveniet iste iure magnam minima modi omnis optio quas recusandae repellendus sequi similique sint, tenetur totam velit vero, vitae, voluptatum!</div><div>Accusantium, aliquid animi consequuntur corporis cum cumque, deserunt enim error fugit iusto laborum magnam magni nostrum obcaecati odit possimus quas quod repellendus reprehenderit sed. Blanditiis illum molestiae praesentium soluta veritatis!</div><div>Accusamus amet dolor dolore eaque esse facere, fugiat harum hic inventore itaque labore laudantium libero obcaecati odio omnis perspiciatis quod reprehenderit repudiandae sequi soluta suscipit tempore unde ut voluptate voluptatem.</div>
                </pre>
                    </div>
                </div>
            </div>
<#--            CHECKBOX TEST-->
            <div class="carousel-item overflow-auto">
                <div class="container-fluid">
                    <div class="col-8 mx-auto">
                        <div class="container">
                <pre id="task">
                    <div>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad alias at cupiditate ea ex fuga fugiat impedit ipsum magnam officia, voluptate voluptatem. Aperiam atque consequuntur corporis laboriosam libero neque perspiciatis.</div>
                </pre>
                            <form id="someId">
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="exampleRadios"
                                           id="exampleRadios1" value="option1" checked>
                                    <label class="form-check-label" for="exampleRadios1">
                                        Answer1
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="exampleRadios"
                                           id="exampleRadios2" value="option2">
                                    <label class="form-check-label" for="exampleRadios2">
                                        Answer2
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="exampleRadios"
                                           id="exampleRadios2" value="option3">
                                    <label class="form-check-label" for="exampleRadios2">
                                        Answer3
                                    </label>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <a class="carousel-control-prev" href="#carouselId" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselId" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <footer class="container">
        <small>
            Описание <span>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi cumque deserunt eius nihil nisi nostrum quis totam veritatis! Cum cumque error harum quas repellat soluta sunt veniam! Dolores, repellat vel.</span><span>Atque et molestiae, optio quia quod repellat soluta unde vitae? Amet architecto cupiditate deleniti, doloremque eos esse eveniet explicabo odio officiis quae repudiandae similique sint totam ut voluptatum. Illo, mollitia?</span><span>Adipisci at aut autem culpa cumque cupiditate delectus deleniti eaque eligendi facere fugit ipsam magnam molestias necessitatibus, nihil omnis perferendis placeat possimus quibusdam, quod ratione reiciendis reprehenderit repudiandae sapiente sit!</span>
        </small>
    </footer>
</main>
<script>
    document.getElementById("errors").onclick = function () {
        $('#my_alerts').append("<div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button><strong>Не правильно(</strong></div>");
        $("#someId").serializeArray()[0].value;
    };
</script>
<link rel="stylesheet" href="/css/lesson_page.css">
</body>
</html>