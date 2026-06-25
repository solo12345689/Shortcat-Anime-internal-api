.class public final Lx/l$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ls0/E1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createOutline-Pq9zytI(JLi1/t;Li1/d;)Ls0/i1;
    .locals 3

    .line 1
    invoke-static {}, Lx/l;->b()F

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    invoke-interface {p4, p3}, Li1/d;->s0(F)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    int-to-float p3, p3

    .line 10
    new-instance p4, Ls0/i1$b;

    .line 11
    .line 12
    new-instance v0, Lr0/h;

    .line 13
    .line 14
    neg-float v1, p3

    .line 15
    invoke-static {p1, p2}, Lr0/l;->i(J)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {p1, p2}, Lr0/l;->g(J)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    add-float/2addr p1, p3

    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-direct {v0, p2, v1, v2, p1}, Lr0/h;-><init>(FFFF)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p4, v0}, Ls0/i1$b;-><init>(Lr0/h;)V

    .line 29
    .line 30
    .line 31
    return-object p4
.end method
