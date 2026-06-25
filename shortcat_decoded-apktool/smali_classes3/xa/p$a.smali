.class public abstract Lxa/p$a;
.super Lxa/a$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private final a:Lxa/p;

.field protected b:Lxa/p;


# direct methods
.method protected constructor <init>(Lxa/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxa/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxa/p$a;->a:Lxa/p;

    .line 5
    .line 6
    invoke-virtual {p1}, Lxa/p;->t()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lxa/p$a;->g()Lxa/p;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lxa/p$a;->b:Lxa/p;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "Default instance must be immutable."

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method private g()Lxa/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/p$a;->a:Lxa/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxa/p;->z()Lxa/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public bridge synthetic c()Lxa/D;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxa/p$a;->f()Lxa/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxa/p$a;->e()Lxa/p$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Lxa/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/p$a;->b:Lxa/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxa/p;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lxa/p$a;->b:Lxa/p;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lxa/p$a;->b:Lxa/p;

    .line 13
    .line 14
    invoke-virtual {v0}, Lxa/p;->u()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lxa/p$a;->b:Lxa/p;

    .line 18
    .line 19
    return-object v0
.end method

.method public e()Lxa/p$a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxa/p$a;->f()Lxa/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lxa/p;->x()Lxa/p$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lxa/p$a;->d()Lxa/p;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Lxa/p$a;->b:Lxa/p;

    .line 14
    .line 15
    return-object v0
.end method

.method public f()Lxa/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/p$a;->a:Lxa/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic w()Lxa/D;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxa/p$a;->d()Lxa/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
