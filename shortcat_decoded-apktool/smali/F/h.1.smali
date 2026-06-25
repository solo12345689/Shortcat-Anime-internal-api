.class public final LF/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/h$a;
    }
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:La0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, La0/c;->d:I

    .line 2
    .line 3
    sput v0, LF/h;->b:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La0/c;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [LF/h$a;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LF/h;->a:La0/c;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(II)LF/h$a;
    .locals 1

    .line 1
    new-instance v0, LF/h$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, LF/h$a;-><init>(II)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LF/h;->a:La0/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, La0/c;->c(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final b()I
    .locals 6

    .line 1
    iget-object v0, p0, LF/h;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/c;->n()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF/h$a;

    .line 8
    .line 9
    invoke-virtual {v0}, LF/h$a;->a()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, LF/h;->a:La0/c;

    .line 14
    .line 15
    invoke-virtual {v1}, La0/c;->p()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-lez v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {v1}, La0/c;->o()[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v3, 0x0

    .line 26
    :cond_0
    aget-object v4, v1, v3

    .line 27
    .line 28
    check-cast v4, LF/h$a;

    .line 29
    .line 30
    invoke-virtual {v4}, LF/h$a;->a()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-le v5, v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v4}, LF/h$a;->a()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    if-lt v3, v2, :cond_0

    .line 43
    .line 44
    :cond_2
    return v0
.end method

.method public final c()I
    .locals 6

    .line 1
    iget-object v0, p0, LF/h;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/c;->n()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF/h$a;

    .line 8
    .line 9
    invoke-virtual {v0}, LF/h$a;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, LF/h;->a:La0/c;

    .line 14
    .line 15
    invoke-virtual {v1}, La0/c;->p()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-lez v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {v1}, La0/c;->o()[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v3, 0x0

    .line 26
    :cond_0
    aget-object v4, v1, v3

    .line 27
    .line 28
    check-cast v4, LF/h$a;

    .line 29
    .line 30
    invoke-virtual {v4}, LF/h$a;->b()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-ge v5, v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v4}, LF/h$a;->b()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    if-lt v3, v2, :cond_0

    .line 43
    .line 44
    :cond_2
    if-ltz v0, :cond_3

    .line 45
    .line 46
    return v0

    .line 47
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v1, "negative minIndex"

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF/h;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/c;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e(LF/h$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF/h;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La0/c;->w(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
