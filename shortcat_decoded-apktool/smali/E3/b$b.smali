.class public final LE3/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private b:LE3/T6;

.field private c:I

.field private d:I

.field private e:Landroid/net/Uri;

.field private f:Ljava/lang/CharSequence;

.field private g:Landroid/os/Bundle;

.field private h:Z

.field private i:LS9/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, LE3/b$b;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-static {p1}, LE3/b;->h(I)I

    move-result v0

    invoke-direct {p0, p1, v0}, LE3/b$b;-><init>(II)V

    return-void
.end method

.method constructor <init>(II)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, LE3/b$b;->a:I

    .line 5
    iput p2, p0, LE3/b$b;->d:I

    .line 6
    const-string p1, ""

    iput-object p1, p0, LE3/b$b;->f:Ljava/lang/CharSequence;

    .line 7
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    iput-object p1, p0, LE3/b$b;->g:Landroid/os/Bundle;

    const/4 p1, -0x1

    .line 8
    iput p1, p0, LE3/b$b;->c:I

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LE3/b$b;->h:Z

    return-void
.end method


# virtual methods
.method public a()LE3/b;
    .locals 12

    .line 1
    iget-object v0, p0, LE3/b$b;->b:LE3/T6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget v3, p0, LE3/b$b;->c:I

    .line 11
    .line 12
    const/4 v4, -0x1

    .line 13
    if-ne v3, v4, :cond_1

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move v3, v1

    .line 18
    :goto_1
    if-eq v0, v3, :cond_2

    .line 19
    .line 20
    move v1, v2

    .line 21
    :cond_2
    const-string v0, "Exactly one of sessionCommand and playerCommand should be set"

    .line 22
    .line 23
    invoke-static {v1, v0}, Lt2/a;->h(ZLjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, LE3/b$b;->i:LS9/e;

    .line 27
    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    iget v0, p0, LE3/b$b;->c:I

    .line 31
    .line 32
    iget v1, p0, LE3/b$b;->a:I

    .line 33
    .line 34
    invoke-static {v0, v1}, LE3/b;->g(II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, LS9/e;->h(I)LS9/e;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, LE3/b$b;->i:LS9/e;

    .line 43
    .line 44
    :cond_3
    new-instance v1, LE3/b;

    .line 45
    .line 46
    iget-object v2, p0, LE3/b$b;->b:LE3/T6;

    .line 47
    .line 48
    iget v3, p0, LE3/b$b;->c:I

    .line 49
    .line 50
    iget v4, p0, LE3/b$b;->a:I

    .line 51
    .line 52
    iget v5, p0, LE3/b$b;->d:I

    .line 53
    .line 54
    iget-object v6, p0, LE3/b$b;->e:Landroid/net/Uri;

    .line 55
    .line 56
    iget-object v7, p0, LE3/b$b;->f:Ljava/lang/CharSequence;

    .line 57
    .line 58
    iget-object v8, p0, LE3/b$b;->g:Landroid/os/Bundle;

    .line 59
    .line 60
    iget-boolean v9, p0, LE3/b$b;->h:Z

    .line 61
    .line 62
    iget-object v10, p0, LE3/b$b;->i:LS9/e;

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    invoke-direct/range {v1 .. v11}, LE3/b;-><init>(LE3/T6;IIILandroid/net/Uri;Ljava/lang/CharSequence;Landroid/os/Bundle;ZLS9/e;LE3/b$a;)V

    .line 66
    .line 67
    .line 68
    return-object v1
.end method

.method public b(I)LE3/b$b;
    .locals 0

    .line 1
    iput p1, p0, LE3/b$b;->d:I

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Ljava/lang/CharSequence;)LE3/b$b;
    .locals 0

    .line 1
    iput-object p1, p0, LE3/b$b;->f:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method

.method public d(Z)LE3/b$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, LE3/b$b;->h:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public e(Landroid/os/Bundle;)LE3/b$b;
    .locals 1

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LE3/b$b;->g:Landroid/os/Bundle;

    .line 7
    .line 8
    return-object p0
.end method

.method public f(I)LE3/b$b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LE3/b$b;->b(I)LE3/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public g(Landroid/net/Uri;)LE3/b$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "content"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "android.resource"

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 29
    :goto_1
    const-string v1, "Only content or resource Uris are supported for CommandButton"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LE3/b$b;->e:Landroid/net/Uri;

    .line 35
    .line 36
    return-object p0
.end method

.method public h(I)LE3/b$b;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/b$b;->b:LE3/T6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set."

    .line 9
    .line 10
    invoke-static {v0, v1}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput p1, p0, LE3/b$b;->c:I

    .line 14
    .line 15
    return-object p0
.end method

.method public i(LE3/T6;)LE3/b$b;
    .locals 2

    .line 1
    const-string v0, "sessionCommand should not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v0, p0, LE3/b$b;->c:I

    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    const-string v1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set."

    .line 15
    .line 16
    invoke-static {v0, v1}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LE3/b$b;->b:LE3/T6;

    .line 20
    .line 21
    return-object p0
.end method

.method public varargs j([I)LE3/b$b;
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    if-eqz v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-static {v0}, Lt2/a;->a(Z)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, LS9/e;->b([I)LS9/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LE3/b$b;->i:LS9/e;

    .line 15
    .line 16
    return-object p0
.end method
