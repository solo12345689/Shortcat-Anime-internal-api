.class final Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt;->toShape(Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;)Ls0/E1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Ls0/m1;",
        "Lr0/l;",
        "size",
        "Li1/t;",
        "<anonymous parameter 1>",
        "LTd/L;",
        "invoke-12SF9DM",
        "(Ls0/m1;JLi1/t;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ls0/m1;

    .line 2
    .line 3
    check-cast p2, Lr0/l;

    .line 4
    .line 5
    invoke-virtual {p2}, Lr0/l;->m()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    check-cast p3, Li1/t;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/components/ktx/ShapeKt$toShape$1;->invoke-12SF9DM(Ls0/m1;JLi1/t;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, LTd/L;->a:LTd/L;

    .line 15
    .line 16
    return-object p1
.end method

.method public final invoke-12SF9DM(Ls0/m1;JLi1/t;)V
    .locals 3

    .line 1
    const-string v0, "$this$$receiver"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "<anonymous parameter 1>"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const p4, 0x3dcccccd    # 0.1f

    .line 12
    .line 13
    .line 14
    invoke-static {p2, p3}, Lr0/l;->g(J)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    mul-float/2addr v0, p4

    .line 19
    const/high16 p4, 0x40000000    # 2.0f

    .line 20
    .line 21
    mul-float/2addr v0, p4

    .line 22
    const/4 p4, 0x0

    .line 23
    invoke-interface {p1, p4, p4}, Ls0/m1;->a(FF)V

    .line 24
    .line 25
    .line 26
    invoke-static {p2, p3}, Lr0/l;->i(J)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-interface {p1, v1, p4}, Ls0/m1;->c(FF)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2, p3}, Lr0/l;->i(J)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {p2, p3}, Lr0/l;->g(J)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-interface {p1, v1, v2}, Ls0/m1;->c(FF)V

    .line 42
    .line 43
    .line 44
    invoke-static {p2, p3}, Lr0/l;->i(J)F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v2, 0x2

    .line 49
    int-to-float v2, v2

    .line 50
    div-float/2addr v1, v2

    .line 51
    invoke-static {p2, p3}, Lr0/l;->g(J)F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    sub-float/2addr v2, v0

    .line 56
    invoke-static {p2, p3}, Lr0/l;->g(J)F

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-interface {p1, v1, v2, p4, p2}, Ls0/m1;->j(FFFF)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, p4, p4}, Ls0/m1;->c(FF)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
