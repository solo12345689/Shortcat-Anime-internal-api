.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$1$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt;->AsyncImage(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;LG4/h;Lv4/d;Landroidx/compose/ui/e;Lw0/b;LI0/f;Ljava/lang/String;FLandroidx/compose/ui/graphics/d;Lkotlin/jvm/functions/Function1;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcoil/compose/AsyncImagePainter$State$Error;",
        "it",
        "LTd/L;",
        "invoke",
        "(Lcoil/compose/AsyncImagePainter$State$Error;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $onError:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $source:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$1$1;->$source:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$1$1;->$onError:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcoil/compose/AsyncImagePainter$State$Error;

    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$1$1;->invoke(Lcoil/compose/AsyncImagePainter$State$Error;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lcoil/compose/AsyncImagePainter$State$Error;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$1$1;->$source:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;

    .line 3
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource$Local;

    const/16 v2, 0x27

    if-eqz v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error loading local image: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$1$1;->$source:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;

    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource$Local;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource$Local;->getResource()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource$Remote;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error loading image from \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$1$1;->$source:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;

    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource$Remote;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource$Remote;->getUrlString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    :goto_0
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    invoke-virtual {p1}, Lcoil/compose/AsyncImagePainter$State$Error;->d()LG4/f;

    move-result-object v2

    invoke-virtual {v2}, LG4/f;->c()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$1$1;->$onError:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    .line 7
    :cond_2
    new-instance p1, LTd/r;

    invoke-direct {p1}, LTd/r;-><init>()V

    throw p1
.end method
