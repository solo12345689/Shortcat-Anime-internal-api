.class public final Lx2/c$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw2/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:Lx2/a;

.field private b:Lw2/g$a;

.field private c:Lw2/f$a;

.field private d:Lx2/h;

.field private e:Z

.field private f:Lw2/g$a;

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw2/t$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lw2/t$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx2/c$c;->b:Lw2/g$a;

    .line 10
    .line 11
    sget-object v0, Lx2/h;->a:Lx2/h;

    .line 12
    .line 13
    iput-object v0, p0, Lx2/c$c;->d:Lx2/h;

    .line 14
    .line 15
    return-void
.end method

.method private c(Lw2/g;II)Lx2/c;
    .locals 12

    .line 1
    iget-object v0, p0, Lx2/c$c;->a:Lx2/a;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lx2/a;

    .line 9
    .line 10
    iget-boolean v0, p0, Lx2/c$c;->e:Z

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object v0, p0, Lx2/c$c;->c:Lw2/f$a;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Lw2/f$a;->a()Lw2/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    move-object v5, v0

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    new-instance v0, Lx2/b$b;

    .line 28
    .line 29
    invoke-direct {v0}, Lx2/b$b;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Lx2/b$b;->b(Lx2/a;)Lx2/b$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lx2/b$b;->a()Lw2/f;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 42
    goto :goto_0

    .line 43
    :goto_2
    new-instance v1, Lx2/c;

    .line 44
    .line 45
    iget-object v0, p0, Lx2/c$c;->b:Lw2/g$a;

    .line 46
    .line 47
    invoke-interface {v0}, Lw2/g$a;->a()Lw2/g;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object v6, p0, Lx2/c$c;->d:Lx2/h;

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    move-object v3, p1

    .line 57
    move v7, p2

    .line 58
    move v9, p3

    .line 59
    invoke-direct/range {v1 .. v11}, Lx2/c;-><init>(Lx2/a;Lw2/g;Lw2/g;Lw2/f;Lx2/h;ILq2/Q;ILx2/c$b;Lx2/c$a;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method


# virtual methods
.method public bridge synthetic a()Lw2/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx2/c$c;->b()Lx2/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Lx2/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lx2/c$c;->f:Lw2/g$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lw2/g$a;->a()Lw2/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Lx2/c$c;->h:I

    .line 12
    .line 13
    iget v2, p0, Lx2/c$c;->g:I

    .line 14
    .line 15
    invoke-direct {p0, v0, v1, v2}, Lx2/c$c;->c(Lw2/g;II)Lx2/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public d(Lx2/a;)Lx2/c$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lx2/c$c;->a:Lx2/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public e(I)Lx2/c$c;
    .locals 0

    .line 1
    iput p1, p0, Lx2/c$c;->h:I

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Lw2/g$a;)Lx2/c$c;
    .locals 0

    .line 1
    iput-object p1, p0, Lx2/c$c;->f:Lw2/g$a;

    .line 2
    .line 3
    return-object p0
.end method
