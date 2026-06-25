.class public final Lq2/h0$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final f:Ljava/lang/String;

.field private static final g:Ljava/lang/String;

.field private static final h:Ljava/lang/String;

.field private static final i:Ljava/lang/String;


# instance fields
.field public final a:I

.field private final b:Lq2/a0;

.field private final c:Z

.field private final d:[I

.field private final e:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lq2/h0$a;->f:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lq2/h0$a;->g:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lq2/h0$a;->h:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lq2/h0$a;->i:Ljava/lang/String;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lq2/a0;Z[I[Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lq2/a0;->a:I

    .line 5
    .line 6
    iput v0, p0, Lq2/h0$a;->a:I

    .line 7
    .line 8
    array-length v1, p3

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    array-length v1, p4

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v2

    .line 19
    :goto_0
    invoke-static {v1}, Lt2/a;->a(Z)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lq2/h0$a;->b:Lq2/a0;

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    if-le v0, v3, :cond_1

    .line 27
    .line 28
    move v2, v3

    .line 29
    :cond_1
    iput-boolean v2, p0, Lq2/h0$a;->c:Z

    .line 30
    .line 31
    invoke-virtual {p3}, [I->clone()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, [I

    .line 36
    .line 37
    iput-object p1, p0, Lq2/h0$a;->d:[I

    .line 38
    .line 39
    invoke-virtual {p4}, [Z->clone()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, [Z

    .line 44
    .line 45
    iput-object p1, p0, Lq2/h0$a;->e:[Z

    .line 46
    .line 47
    return-void
.end method

.method public static b(Landroid/os/Bundle;)Lq2/h0$a;
    .locals 5

    .line 1
    sget-object v0, Lq2/h0$a;->f:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-static {v0}, Lq2/a0;->b(Landroid/os/Bundle;)Lq2/a0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lq2/h0$a;->g:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v2, v0, Lq2/a0;->a:I

    .line 24
    .line 25
    new-array v2, v2, [I

    .line 26
    .line 27
    invoke-static {v1, v2}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, [I

    .line 32
    .line 33
    sget-object v2, Lq2/h0$a;->h:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getBooleanArray(Ljava/lang/String;)[Z

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget v3, v0, Lq2/a0;->a:I

    .line 40
    .line 41
    new-array v3, v3, [Z

    .line 42
    .line 43
    invoke-static {v2, v3}, LO9/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, [Z

    .line 48
    .line 49
    sget-object v3, Lq2/h0$a;->i:Ljava/lang/String;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-virtual {p0, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    new-instance v3, Lq2/h0$a;

    .line 57
    .line 58
    invoke-direct {v3, v0, p0, v1, v2}, Lq2/h0$a;-><init>(Lq2/a0;Z[I[Z)V

    .line 59
    .line 60
    .line 61
    return-object v3
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lq2/h0$a;
    .locals 4

    .line 1
    new-instance v0, Lq2/h0$a;

    .line 2
    .line 3
    iget-object v1, p0, Lq2/h0$a;->b:Lq2/a0;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lq2/a0;->a(Ljava/lang/String;)Lq2/a0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-boolean v1, p0, Lq2/h0$a;->c:Z

    .line 10
    .line 11
    iget-object v2, p0, Lq2/h0$a;->d:[I

    .line 12
    .line 13
    iget-object v3, p0, Lq2/h0$a;->e:[Z

    .line 14
    .line 15
    invoke-direct {v0, p1, v1, v2, v3}, Lq2/h0$a;-><init>(Lq2/a0;Z[I[Z)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public c()Lq2/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/h0$a;->b:Lq2/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public d(I)Lq2/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/h0$a;->b:Lq2/a0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq2/a0;->c(I)Lq2/x;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/h0$a;->b:Lq2/a0;

    .line 2
    .line 3
    iget v0, v0, Lq2/a0;->c:I

    .line 4
    .line 5
    return v0
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
    const-class v2, Lq2/h0$a;

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
    check-cast p1, Lq2/h0$a;

    .line 18
    .line 19
    iget-boolean v2, p0, Lq2/h0$a;->c:Z

    .line 20
    .line 21
    iget-boolean v3, p1, Lq2/h0$a;->c:Z

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lq2/h0$a;->b:Lq2/a0;

    .line 26
    .line 27
    iget-object v3, p1, Lq2/h0$a;->b:Lq2/a0;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lq2/a0;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Lq2/h0$a;->d:[I

    .line 36
    .line 37
    iget-object v3, p1, Lq2/h0$a;->d:[I

    .line 38
    .line 39
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, Lq2/h0$a;->e:[Z

    .line 46
    .line 47
    iget-object p1, p1, Lq2/h0$a;->e:[Z

    .line 48
    .line 49
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    return v0

    .line 56
    :cond_2
    :goto_0
    return v1
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq2/h0$a;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public g()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq2/h0$a;->e:[Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, LS9/a;->a([ZZ)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public h(Z)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lq2/h0$a;->d:[I

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1, p1}, Lq2/h0$a;->k(IZ)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lq2/h0$a;->b:Lq2/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq2/a0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean v1, p0, Lq2/h0$a;->c:Z

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v1, p0, Lq2/h0$a;->d:[I

    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v1, p0, Lq2/h0$a;->e:[Z

    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Z)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/2addr v0, v1

    .line 30
    return v0
.end method

.method public i(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/h0$a;->e:[Z

    .line 2
    .line 3
    aget-boolean p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public j(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lq2/h0$a;->k(IZ)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public k(IZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/h0$a;->d:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public l()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lq2/h0$a;->f:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v2, p0, Lq2/h0$a;->b:Lq2/a0;

    .line 9
    .line 10
    invoke-virtual {v2}, Lq2/a0;->h()Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lq2/h0$a;->g:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, p0, Lq2/h0$a;->d:[I

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lq2/h0$a;->h:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v2, p0, Lq2/h0$a;->e:[Z

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Lq2/h0$a;->i:Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v2, p0, Lq2/h0$a;->c:Z

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method
