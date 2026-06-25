.class final Ly4/d$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ly4/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Ly4/b$d;


# direct methods
.method public constructor <init>(Ly4/b$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly4/d$c;->a:Ly4/b$d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ly4/d$b;
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/d$c;->a:Ly4/b$d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly4/b$d;->a()Ly4/b$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Ly4/d$b;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ly4/d$b;-><init>(Ly4/b$b;)V

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/d$c;->a:Ly4/b$d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly4/b$d;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()Ltg/P;
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/d$c;->a:Ly4/b$d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ly4/b$d;->b(I)Ltg/P;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getMetadata()Ltg/P;
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/d$c;->a:Ly4/b$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ly4/b$d;->b(I)Ltg/P;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public bridge synthetic o1()Ly4/a$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly4/d$c;->a()Ly4/d$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
