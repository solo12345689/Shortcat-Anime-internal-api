.class public final Lq2/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/c$d;,
        Lq2/c$e;,
        Lq2/c$c;,
        Lq2/c$b;
    }
.end annotation


# static fields
.field public static final h:Lq2/c;

.field private static final i:Ljava/lang/String;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Z

.field private g:Lq2/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq2/c$e;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/c$e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lq2/c$e;->a()Lq2/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lq2/c;->h:Lq2/c;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lq2/c;->i:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lq2/c;->j:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lq2/c;->k:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lq2/c;->l:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lq2/c;->m:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x5

    .line 48
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lq2/c;->n:Ljava/lang/String;

    .line 53
    .line 54
    return-void
.end method

.method private constructor <init>(IIIIIZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lq2/c;->a:I

    .line 4
    iput p2, p0, Lq2/c;->b:I

    .line 5
    iput p3, p0, Lq2/c;->c:I

    .line 6
    iput p4, p0, Lq2/c;->d:I

    .line 7
    iput p5, p0, Lq2/c;->e:I

    .line 8
    iput-boolean p6, p0, Lq2/c;->f:Z

    return-void
.end method

.method synthetic constructor <init>(IIIIIZLq2/c$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lq2/c;-><init>(IIIIIZ)V

    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lq2/c;
    .locals 3

    .line 1
    new-instance v0, Lq2/c$e;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/c$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lq2/c;->i:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0, v1}, Lq2/c$e;->c(I)Lq2/c$e;

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object v1, Lq2/c;->j:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Lq2/c$e;->d(I)Lq2/c$e;

    .line 34
    .line 35
    .line 36
    :cond_1
    sget-object v1, Lq2/c;->k:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {v0, v1}, Lq2/c$e;->g(I)Lq2/c$e;

    .line 49
    .line 50
    .line 51
    :cond_2
    sget-object v1, Lq2/c;->l:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0, v1}, Lq2/c$e;->b(I)Lq2/c$e;

    .line 64
    .line 65
    .line 66
    :cond_3
    sget-object v1, Lq2/c;->m:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {v0, v1}, Lq2/c$e;->f(I)Lq2/c$e;

    .line 79
    .line 80
    .line 81
    :cond_4
    sget-object v1, Lq2/c;->n:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-virtual {v0, p0}, Lq2/c$e;->e(Z)Lq2/c$e;

    .line 94
    .line 95
    .line 96
    :cond_5
    invoke-virtual {v0}, Lq2/c$e;->a()Lq2/c;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method


# virtual methods
.method public b()Lq2/c$d;
    .locals 2

    .line 1
    iget-object v0, p0, Lq2/c;->g:Lq2/c$d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lq2/c$d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lq2/c$d;-><init>(Lq2/c;Lq2/c$a;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lq2/c;->g:Lq2/c$d;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lq2/c;->g:Lq2/c$d;

    .line 14
    .line 15
    return-object v0
.end method

.method public c()I
    .locals 2

    .line 1
    iget v0, p0, Lq2/c;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget v0, p0, Lq2/c;->c:I

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :pswitch_0
    const/4 v0, 0x3

    .line 14
    return v0

    .line 15
    :pswitch_1
    return v1

    .line 16
    :pswitch_2
    const/16 v0, 0xa

    .line 17
    .line 18
    return v0

    .line 19
    :pswitch_3
    const/4 v0, 0x2

    .line 20
    return v0

    .line 21
    :pswitch_4
    const/4 v0, 0x5

    .line 22
    return v0

    .line 23
    :pswitch_5
    const/4 v0, 0x4

    .line 24
    return v0

    .line 25
    :pswitch_6
    const/16 v0, 0x8

    .line 26
    .line 27
    return v0

    .line 28
    :pswitch_7
    const/4 v0, 0x0

    .line 29
    return v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public d()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lq2/c;->i:Ljava/lang/String;

    .line 7
    .line 8
    iget v2, p0, Lq2/c;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lq2/c;->j:Ljava/lang/String;

    .line 14
    .line 15
    iget v2, p0, Lq2/c;->b:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lq2/c;->k:Ljava/lang/String;

    .line 21
    .line 22
    iget v2, p0, Lq2/c;->c:I

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lq2/c;->l:Ljava/lang/String;

    .line 28
    .line 29
    iget v2, p0, Lq2/c;->d:I

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    sget-object v1, Lq2/c;->m:Ljava/lang/String;

    .line 35
    .line 36
    iget v2, p0, Lq2/c;->e:I

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    sget-object v1, Lq2/c;->n:Ljava/lang/String;

    .line 42
    .line 43
    iget-boolean v2, p0, Lq2/c;->f:Z

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lq2/c;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lq2/c;

    .line 18
    .line 19
    iget v2, p0, Lq2/c;->a:I

    .line 20
    .line 21
    iget v3, p1, Lq2/c;->a:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget v2, p0, Lq2/c;->b:I

    .line 26
    .line 27
    iget v3, p1, Lq2/c;->b:I

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    iget v2, p0, Lq2/c;->c:I

    .line 32
    .line 33
    iget v3, p1, Lq2/c;->c:I

    .line 34
    .line 35
    if-ne v2, v3, :cond_2

    .line 36
    .line 37
    iget v2, p0, Lq2/c;->d:I

    .line 38
    .line 39
    iget v3, p1, Lq2/c;->d:I

    .line 40
    .line 41
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    iget v2, p0, Lq2/c;->e:I

    .line 44
    .line 45
    iget v3, p1, Lq2/c;->e:I

    .line 46
    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    iget-boolean v2, p0, Lq2/c;->f:Z

    .line 50
    .line 51
    iget-boolean p1, p1, Lq2/c;->f:Z

    .line 52
    .line 53
    if-ne v2, p1, :cond_2

    .line 54
    .line 55
    return v0

    .line 56
    :cond_2
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    const/16 v0, 0x20f

    .line 2
    .line 3
    iget v1, p0, Lq2/c;->a:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget v1, p0, Lq2/c;->b:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget v1, p0, Lq2/c;->c:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget v1, p0, Lq2/c;->d:I

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget v1, p0, Lq2/c;->e:I

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-boolean v1, p0, Lq2/c;->f:Z

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    return v0
.end method
