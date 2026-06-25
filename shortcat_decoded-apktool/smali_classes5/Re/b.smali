.class public LRe/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQe/x$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRe/b$b;,
        LRe/b$d;,
        LRe/b$e;,
        LRe/b$c;
    }
.end annotation


# static fields
.field private static j:Z

.field private static final k:Ljava/util/Map;


# instance fields
.field private a:[I

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:[Ljava/lang/String;

.field private f:[Ljava/lang/String;

.field private g:[Ljava/lang/String;

.field private h:LRe/a$a;

.field private i:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "true"

    .line 2
    .line 3
    const-string v1, "kotlin.ignore.old.metadata"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sput-boolean v0, LRe/b;->j:Z
    :try_end_0
    .catch Ljava/security/AccessControlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    sput-boolean v0, LRe/b;->j:Z

    .line 18
    .line 19
    :goto_0
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, LRe/b;->k:Ljava/util/Map;

    .line 25
    .line 26
    new-instance v1, LXe/c;

    .line 27
    .line 28
    const-string v2, "kotlin.jvm.internal.KotlinClass"

    .line 29
    .line 30
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, LXe/b;->k(LXe/c;)LXe/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, LRe/a$a;->e:LRe/a$a;

    .line 38
    .line 39
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    new-instance v1, LXe/c;

    .line 43
    .line 44
    const-string v2, "kotlin.jvm.internal.KotlinFileFacade"

    .line 45
    .line 46
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, LXe/b;->k(LXe/c;)LXe/b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, LRe/a$a;->f:LRe/a$a;

    .line 54
    .line 55
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    new-instance v1, LXe/c;

    .line 59
    .line 60
    const-string v2, "kotlin.jvm.internal.KotlinMultifileClass"

    .line 61
    .line 62
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, LXe/b;->k(LXe/c;)LXe/b;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v2, LRe/a$a;->h:LRe/a$a;

    .line 70
    .line 71
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    new-instance v1, LXe/c;

    .line 75
    .line 76
    const-string v2, "kotlin.jvm.internal.KotlinMultifileClassPart"

    .line 77
    .line 78
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, LXe/b;->k(LXe/c;)LXe/b;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v2, LRe/a$a;->i:LRe/a$a;

    .line 86
    .line 87
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    new-instance v1, LXe/c;

    .line 91
    .line 92
    const-string v2, "kotlin.jvm.internal.KotlinSyntheticClass"

    .line 93
    .line 94
    invoke-direct {v1, v2}, LXe/c;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, LXe/b;->k(LXe/c;)LXe/b;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    sget-object v2, LRe/a$a;->g:LRe/a$a;

    .line 102
    .line 103
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LRe/b;->a:[I

    .line 6
    .line 7
    iput-object v0, p0, LRe/b;->b:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, p0, LRe/b;->c:I

    .line 11
    .line 12
    iput-object v0, p0, LRe/b;->d:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, LRe/b;->e:[Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, LRe/b;->f:[Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, LRe/b;->g:[Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, LRe/b;->h:LRe/a$a;

    .line 21
    .line 22
    iput-object v0, p0, LRe/b;->i:[Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method private static synthetic d(I)V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq p0, v2, :cond_0

    .line 7
    .line 8
    const-string p0, "classId"

    .line 9
    .line 10
    aput-object p0, v0, v1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "source"

    .line 14
    .line 15
    aput-object p0, v0, v1

    .line 16
    .line 17
    :goto_0
    const-string p0, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor"

    .line 18
    .line 19
    aput-object p0, v0, v2

    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    const-string v1, "visitAnnotation"

    .line 23
    .line 24
    aput-object v1, v0, p0

    .line 25
    .line 26
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 27
    .line 28
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method static synthetic e(LRe/b;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, LRe/b;->i:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic f(LRe/b;LRe/a$a;)LRe/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, LRe/b;->h:LRe/a$a;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic g(LRe/b;[I)[I
    .locals 0

    .line 1
    iput-object p1, p0, LRe/b;->a:[I

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic h(LRe/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, LRe/b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic i(LRe/b;I)I
    .locals 0

    .line 1
    iput p1, p0, LRe/b;->c:I

    .line 2
    .line 3
    return p1
.end method

.method static synthetic j(LRe/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, LRe/b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic k(LRe/b;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, LRe/b;->e:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic l(LRe/b;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, LRe/b;->f:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method private o()Z
    .locals 2

    .line 1
    iget-object v0, p0, LRe/b;->h:LRe/a$a;

    .line 2
    .line 3
    sget-object v1, LRe/a$a;->e:LRe/a$a;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    sget-object v1, LRe/a$a;->f:LRe/a$a;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    sget-object v1, LRe/a$a;->i:LRe/a$a;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(LXe/b;Lye/h0;)LQe/x$a;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, LRe/b;->d(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p2, :cond_1

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    invoke-static {p2}, LRe/b;->d(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p1}, LXe/b;->a()LXe/c;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    sget-object v0, LHe/I;->a:LXe/c;

    .line 18
    .line 19
    invoke-virtual {p2, v0}, LXe/c;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    new-instance p1, LRe/b$c;

    .line 27
    .line 28
    invoke-direct {p1, p0, v1}, LRe/b$c;-><init>(LRe/b;LRe/b$a;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_2
    sget-object v0, LHe/I;->t:LXe/c;

    .line 33
    .line 34
    invoke-virtual {p2, v0}, LXe/c;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    new-instance p1, LRe/b$d;

    .line 41
    .line 42
    invoke-direct {p1, p0, v1}, LRe/b$d;-><init>(LRe/b;LRe/b$a;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_3
    sget-boolean p2, LRe/b;->j:Z

    .line 47
    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_4
    iget-object p2, p0, LRe/b;->h:LRe/a$a;

    .line 52
    .line 53
    if-eqz p2, :cond_5

    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_5
    sget-object p2, LRe/b;->k:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, LRe/a$a;

    .line 63
    .line 64
    if-eqz p1, :cond_6

    .line 65
    .line 66
    iput-object p1, p0, LRe/b;->h:LRe/a$a;

    .line 67
    .line 68
    new-instance p1, LRe/b$e;

    .line 69
    .line 70
    invoke-direct {p1, p0, v1}, LRe/b$e;-><init>(LRe/b;LRe/b$a;)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_6
    return-object v1
.end method

.method public m(LUe/c;)LRe/a;
    .locals 12

    .line 1
    iget-object v0, p0, LRe/b;->h:LRe/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    iget-object v0, p0, LRe/b;->a:[I

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    new-instance v4, LUe/c;

    .line 12
    .line 13
    iget-object v0, p0, LRe/b;->a:[I

    .line 14
    .line 15
    iget v2, p0, LRe/b;->c:I

    .line 16
    .line 17
    and-int/lit8 v2, v2, 0x8

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v2, 0x0

    .line 24
    :goto_0
    invoke-direct {v4, v0, v2}, LUe/c;-><init>([IZ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, p1}, LUe/c;->h(LUe/c;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, LRe/b;->e:[Ljava/lang/String;

    .line 34
    .line 35
    iput-object p1, p0, LRe/b;->g:[Ljava/lang/String;

    .line 36
    .line 37
    iput-object v1, p0, LRe/b;->e:[Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-direct {p0}, LRe/b;->o()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, LRe/b;->e:[Ljava/lang/String;

    .line 47
    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_3
    :goto_1
    iget-object p1, p0, LRe/b;->i:[Ljava/lang/String;

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-static {p1}, LWe/a;->e([Ljava/lang/String;)[B

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_4
    move-object v11, v1

    .line 60
    new-instance v2, LRe/a;

    .line 61
    .line 62
    iget-object v3, p0, LRe/b;->h:LRe/a$a;

    .line 63
    .line 64
    iget-object v5, p0, LRe/b;->e:[Ljava/lang/String;

    .line 65
    .line 66
    iget-object v6, p0, LRe/b;->g:[Ljava/lang/String;

    .line 67
    .line 68
    iget-object v7, p0, LRe/b;->f:[Ljava/lang/String;

    .line 69
    .line 70
    iget-object v8, p0, LRe/b;->b:Ljava/lang/String;

    .line 71
    .line 72
    iget v9, p0, LRe/b;->c:I

    .line 73
    .line 74
    iget-object v10, p0, LRe/b;->d:Ljava/lang/String;

    .line 75
    .line 76
    invoke-direct/range {v2 .. v11}, LRe/a;-><init>(LRe/a$a;LUe/c;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[B)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :cond_5
    :goto_2
    return-object v1
.end method

.method public n()LRe/a;
    .locals 1

    .line 1
    sget-object v0, LUe/c;->i:LUe/c;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LRe/b;->m(LUe/c;)LRe/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
