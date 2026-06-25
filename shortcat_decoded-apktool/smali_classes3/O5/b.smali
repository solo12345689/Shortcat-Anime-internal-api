.class public LO5/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO5/b$a;
    }
.end annotation


# instance fields
.field private final a:Ly5/f;

.field private final b:LO5/h;

.field private final c:Ly5/n;


# direct methods
.method private constructor <init>(LO5/b$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LO5/b$a;->a(LO5/b$a;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, LO5/b$a;->a(LO5/b$a;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ly5/f;->c(Ljava/util/List;)Ly5/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    iput-object v0, p0, LO5/b;->a:Ly5/f;

    .line 6
    invoke-static {p1}, LO5/b$a;->b(LO5/b$a;)Ly5/n;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-static {p1}, LO5/b$a;->b(LO5/b$a;)Ly5/n;

    move-result-object v0

    goto :goto_1

    .line 8
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Ly5/o;->a(Ljava/lang/Object;)Ly5/n;

    move-result-object v0

    :goto_1
    iput-object v0, p0, LO5/b;->c:Ly5/n;

    .line 9
    invoke-static {p1}, LO5/b$a;->d(LO5/b$a;)LO5/h;

    move-result-object v0

    iput-object v0, p0, LO5/b;->b:LO5/h;

    .line 10
    invoke-static {p1}, LO5/b$a;->c(LO5/b$a;)Ll6/g;

    return-void
.end method

.method synthetic constructor <init>(LO5/b$a;LO5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LO5/b;-><init>(LO5/b$a;)V

    return-void
.end method

.method public static e()LO5/b$a;
    .locals 1

    .line 1
    new-instance v0, LO5/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LO5/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Ly5/f;
    .locals 1

    .line 1
    iget-object v0, p0, LO5/b;->a:Ly5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Ly5/n;
    .locals 1

    .line 1
    iget-object v0, p0, LO5/b;->c:Ly5/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ll6/g;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public d()LO5/h;
    .locals 1

    .line 1
    iget-object v0, p0, LO5/b;->b:LO5/h;

    .line 2
    .line 3
    return-object v0
.end method
