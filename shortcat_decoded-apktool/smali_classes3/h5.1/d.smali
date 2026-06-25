.class final Lh5/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lh5/b;


# instance fields
.field private final a:Landroid/content/Context;

.field final b:Lh5/b$a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lh5/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lh5/d;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lh5/d;->b:Lh5/b$a;

    .line 11
    .line 12
    return-void
.end method

.method private e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh5/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lh5/r;->a(Landroid/content/Context;)Lh5/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lh5/d;->b:Lh5/b$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lh5/r;->d(Lh5/b$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh5/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lh5/r;->a(Landroid/content/Context;)Lh5/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lh5/d;->b:Lh5/b$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lh5/r;->e(Lh5/b$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh5/d;->g()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh5/d;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method
