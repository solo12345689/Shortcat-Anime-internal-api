.class LF3/a$c$a;
.super LF3/a$b$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF3/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LF3/a$b$a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public build()LF3/a$a;
    .locals 2

    .line 1
    new-instance v0, LF3/a$c;

    .line 2
    .line 3
    iget-object v1, p0, LF3/a$b$a;->a:Landroid/media/AudioAttributes$Builder;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, LF3/a$c;-><init>(Landroid/media/AudioAttributes;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic d(I)LF3/a$a$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LF3/a$c$a;->g(I)LF3/a$c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic f(I)LF3/a$b$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LF3/a$c$a;->g(I)LF3/a$c$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(I)LF3/a$c$a;
    .locals 1

    .line 1
    iget-object v0, p0, LF3/a$b$a;->a:Landroid/media/AudioAttributes$Builder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
