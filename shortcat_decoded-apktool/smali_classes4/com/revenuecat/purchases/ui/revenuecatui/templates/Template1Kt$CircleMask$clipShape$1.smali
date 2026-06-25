.class public final Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$clipShape$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls0/E1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->CircleMask(ZLkotlin/jvm/functions/Function2;LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J*\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "com/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$clipShape$1",
        "Ls0/E1;",
        "Lr0/l;",
        "size",
        "Li1/t;",
        "layoutDirection",
        "Li1/d;",
        "density",
        "Ls0/i1;",
        "createOutline-Pq9zytI",
        "(JLi1/t;Li1/d;)Ls0/i1;",
        "createOutline",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $scale:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$clipShape$1;->$scale:F

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public createOutline-Pq9zytI(JLi1/t;Li1/d;)Ls0/i1;
    .locals 2

    .line 1
    const-string v0, "layoutDirection"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "density"

    .line 7
    .line 8
    invoke-static {p4, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p3, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iget p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$clipShape$1;->$scale:F

    .line 17
    .line 18
    invoke-virtual {p3, p4, p4}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 19
    .line 20
    .line 21
    iget p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$clipShape$1;->$scale:F

    .line 22
    .line 23
    invoke-static {p4, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->access$CircleMask$circleOffsetX(FJ)F

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    iget v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt$CircleMask$clipShape$1;->$scale:F

    .line 28
    .line 29
    invoke-static {v0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/templates/Template1Kt;->access$CircleMask$circleOffsetY(FJ)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p3, p4, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ls0/V;->a()Ls0/m1;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    sget-object v0, Lr0/f;->b:Lr0/f$a;

    .line 41
    .line 42
    invoke-virtual {v0}, Lr0/f$a;->c()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-static {v0, v1, p1, p2}, Lr0/i;->b(JJ)Lr0/h;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 p2, 0x0

    .line 51
    const/4 v0, 0x2

    .line 52
    invoke-static {p4, p1, p2, v0, p2}, Ls0/m1;->p(Ls0/m1;Lr0/h;Ls0/m1$b;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    instance-of p1, p4, Ls0/S;

    .line 56
    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    move-object p1, p4

    .line 60
    check-cast p1, Ls0/S;

    .line 61
    .line 62
    invoke-virtual {p1}, Ls0/S;->v()Landroid/graphics/Path;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1, p3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 67
    .line 68
    .line 69
    new-instance p1, Ls0/i1$a;

    .line 70
    .line 71
    invoke-direct {p1, p4}, Ls0/i1$a;-><init>(Ls0/m1;)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 76
    .line 77
    const-string p2, "Unable to obtain android.graphics.Path"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method
