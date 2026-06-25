.class LR1/a$c;
.super LL1/C;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic b:LR1/a;


# direct methods
.method constructor <init>(LR1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR1/a$c;->b:LR1/a;

    .line 2
    .line 3
    invoke-direct {p0}, LL1/C;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(I)LL1/B;
    .locals 1

    .line 1
    iget-object v0, p0, LR1/a$c;->b:LR1/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR1/a;->H(I)LL1/B;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, LL1/B;->l0(LL1/B;)LL1/B;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d(I)LL1/B;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, LR1/a$c;->b:LR1/a;

    .line 5
    .line 6
    iget p1, p1, LR1/a;->k:I

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, LR1/a$c;->b:LR1/a;

    .line 10
    .line 11
    iget p1, p1, LR1/a;->l:I

    .line 12
    .line 13
    :goto_0
    const/high16 v0, -0x80000000

    .line 14
    .line 15
    if-ne p1, v0, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_1
    invoke-virtual {p0, p1}, LR1/a$c;->b(I)LL1/B;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LR1/a$c;->b:LR1/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LR1/a;->P(IILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
