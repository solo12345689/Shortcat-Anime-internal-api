.class final Ll1/e$a;
.super Lle/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Ll1/e;


# direct methods
.method public constructor <init>(Ll1/e;Ll1/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll1/e$a;->b:Ll1/e;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lle/b;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lpe/m;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ll1/s;

    .line 2
    .line 3
    check-cast p3, Ll1/s;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Ll1/e$a;->e(Lpe/m;Ll1/s;Ll1/s;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method protected e(Lpe/m;Ll1/s;Ll1/s;)V
    .locals 1

    .line 1
    iget-object p2, p0, Ll1/e$a;->b:Ll1/e;

    .line 2
    .line 3
    invoke-virtual {p2}, Ll1/e;->d()Lp1/f;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p1}, Lpe/c;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p3, Ll1/t;

    .line 17
    .line 18
    invoke-virtual {p3}, Ll1/t;->a()Lp1/c;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p2, p1, p3}, Lp1/b;->V(Ljava/lang/String;Lp1/c;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
