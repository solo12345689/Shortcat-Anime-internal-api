.class final Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt;->LocalImage(ILandroidx/compose/ui/e;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V
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

.field final synthetic $modifier:Landroidx/compose/ui/e;

.field final synthetic $resource:I

.field final synthetic $transformation:LJ4/a;


# direct methods
.method constructor <init>(ILandroidx/compose/ui/e;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$resource:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$modifier:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$contentScale:LI0/f;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$contentDescription:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$transformation:LJ4/a;

    .line 10
    .line 11
    iput p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$alpha:F

    .line 12
    .line 13
    iput-object p7, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$colorFilter:Landroidx/compose/ui/graphics/d;

    .line 14
    .line 15
    iput p8, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$$changed:I

    .line 16
    .line 17
    iput p9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$$default:I

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 21
    .line 22
    .line 23
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

    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 10

    .line 2
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$resource:I

    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$modifier:Landroidx/compose/ui/e;

    iget-object v2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$contentScale:LI0/f;

    iget-object v3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$contentDescription:Ljava/lang/String;

    iget-object v4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$transformation:LJ4/a;

    iget v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$alpha:F

    iget-object v6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$colorFilter:Landroidx/compose/ui/graphics/d;

    iget p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LY/g1;->a(I)I

    move-result v8

    iget v9, p0, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt$LocalImage$1;->$$default:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/composables/RemoteImageKt;->LocalImage(ILandroidx/compose/ui/e;LI0/f;Ljava/lang/String;LJ4/a;FLandroidx/compose/ui/graphics/d;LY/m;II)V

    return-void
.end method
