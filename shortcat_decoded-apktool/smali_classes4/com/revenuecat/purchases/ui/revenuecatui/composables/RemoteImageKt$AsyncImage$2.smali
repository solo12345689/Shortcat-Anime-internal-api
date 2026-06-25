.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


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
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $alpha:F

.field final synthetic $colorFilter:Landroidx/compose/ui/graphics/d;

.field final synthetic $contentDescription:Ljava/lang/String;

.field final synthetic $contentScale:LI0/f;

.field final synthetic $imageLoader:Lv4/d;

.field final synthetic $imageRequest:LG4/h;

.field final synthetic $modifier:Landroidx/compose/ui/e;

.field final synthetic $onError:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $placeholder:Lw0/b;

.field final synthetic $source:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;LG4/h;Lv4/d;Landroidx/compose/ui/e;Lw0/b;LI0/f;Ljava/lang/String;FLandroidx/compose/ui/graphics/d;Lkotlin/jvm/functions/Function1;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;",
            "LG4/h;",
            "Lv4/d;",
            "Landroidx/compose/ui/e;",
            "Lw0/b;",
            "LI0/f;",
            "Ljava/lang/String;",
            "F",
            "Landroidx/compose/ui/graphics/d;",
            "Lkotlin/jvm/functions/Function1;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$source:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$imageRequest:LG4/h;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$imageLoader:Lv4/d;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$modifier:Landroidx/compose/ui/e;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$placeholder:Lw0/b;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$contentScale:LI0/f;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$contentDescription:Ljava/lang/String;

    .line 14
    .line 15
    iput p8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$alpha:F

    .line 16
    .line 17
    iput-object p9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$colorFilter:Landroidx/compose/ui/graphics/d;

    .line 18
    .line 19
    iput-object p10, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$onError:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    iput p11, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$$changed:I

    .line 22
    .line 23
    iput p12, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$$default:I

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 13

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$source:Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$imageRequest:LG4/h;

    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$imageLoader:Lv4/d;

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$modifier:Landroidx/compose/ui/e;

    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$placeholder:Lw0/b;

    iget-object v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$contentScale:LI0/f;

    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$contentDescription:Ljava/lang/String;

    iget v7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$alpha:F

    iget-object v8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$colorFilter:Landroidx/compose/ui/graphics/d;

    iget-object v9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$onError:Lkotlin/jvm/functions/Function1;

    iget p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v11

    iget v12, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$AsyncImage$2;->$$default:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt;->access$AsyncImage(Lcom/revenuecat/purchases/ui/revenuecatui/composables/ImageSource;LG4/h;Lv4/d;Landroidx/compose/ui/e;Lw0/b;LI0/f;Ljava/lang/String;FLandroidx/compose/ui/graphics/d;Lkotlin/jvm/functions/Function1;LY/m;II)V

    return-void
.end method
