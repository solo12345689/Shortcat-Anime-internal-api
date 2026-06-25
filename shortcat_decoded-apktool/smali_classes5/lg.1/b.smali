.class public final Llg/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkg/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llg/b$a;,
        Llg/b$b;,
        Llg/b$c;,
        Llg/b$d;,
        Llg/b$e;,
        Llg/b$f;,
        Llg/b$g;
    }
.end annotation


# static fields
.field public static final h:Llg/b$d;


# instance fields
.field private final a:Ldg/A;

.field private final b:Ljg/f;

.field private final c:Ltg/j;

.field private final d:Ltg/i;

.field private e:I

.field private final f:Llg/a;

.field private g:Ldg/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Llg/b$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Llg/b$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Llg/b;->h:Llg/b$d;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldg/A;Ljg/f;Ltg/j;Ltg/i;)V
    .locals 1

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "source"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sink"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Llg/b;->a:Ldg/A;

    .line 20
    .line 21
    iput-object p2, p0, Llg/b;->b:Ljg/f;

    .line 22
    .line 23
    iput-object p3, p0, Llg/b;->c:Ltg/j;

    .line 24
    .line 25
    iput-object p4, p0, Llg/b;->d:Ltg/i;

    .line 26
    .line 27
    new-instance p1, Llg/a;

    .line 28
    .line 29
    invoke-direct {p1, p3}, Llg/a;-><init>(Ltg/j;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Llg/b;->f:Llg/a;

    .line 33
    .line 34
    return-void
.end method

.method public static final synthetic i(Llg/b;Ltg/s;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Llg/b;->r(Ltg/s;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic j(Llg/b;)Ldg/A;
    .locals 0

    .line 1
    iget-object p0, p0, Llg/b;->a:Ldg/A;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Llg/b;)Llg/a;
    .locals 0

    .line 1
    iget-object p0, p0, Llg/b;->f:Llg/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Llg/b;)Ltg/i;
    .locals 0

    .line 1
    iget-object p0, p0, Llg/b;->d:Ltg/i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Llg/b;)Ltg/j;
    .locals 0

    .line 1
    iget-object p0, p0, Llg/b;->c:Ltg/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Llg/b;)I
    .locals 0

    .line 1
    iget p0, p0, Llg/b;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic o(Llg/b;)Ldg/t;
    .locals 0

    .line 1
    iget-object p0, p0, Llg/b;->g:Ldg/t;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Llg/b;I)V
    .locals 0

    .line 1
    iput p1, p0, Llg/b;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic q(Llg/b;Ldg/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llg/b;->g:Ldg/t;

    .line 2
    .line 3
    return-void
.end method

.method private final r(Ltg/s;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ltg/s;->i()Ltg/a0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ltg/a0;->e:Ltg/a0;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ltg/s;->j(Ltg/a0;)Ltg/s;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ltg/a0;->a()Ltg/a0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ltg/a0;->b()Ltg/a0;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final s(Ldg/C;)Z
    .locals 2

    .line 1
    const-string v0, "Transfer-Encoding"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ldg/C;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const-string v1, "chunked"

    .line 9
    .line 10
    invoke-static {v1, p1, v0}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method private final t(Ldg/E;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const-string v2, "Transfer-Encoding"

    .line 4
    .line 5
    invoke-static {p1, v2, v0, v1, v0}, Ldg/E;->D(Ldg/E;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    const-string v1, "chunked"

    .line 11
    .line 12
    invoke-static {v1, p1, v0}, LDf/r;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method private final u()Ltg/X;
    .locals 2

    .line 1
    iget v0, p0, Llg/b;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    iput v0, p0, Llg/b;->e:I

    .line 8
    .line 9
    new-instance v0, Llg/b$b;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Llg/b$b;-><init>(Llg/b;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "state: "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Llg/b;->e:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1
.end method

.method private final v(Ldg/u;)Ltg/Z;
    .locals 2

    .line 1
    iget v0, p0, Llg/b;->e:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Llg/b;->e:I

    .line 8
    .line 9
    new-instance v0, Llg/b$c;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Llg/b$c;-><init>(Llg/b;Ldg/u;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v0, "state: "

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v0, p0, Llg/b;->e:I

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method

.method private final w(J)Ltg/Z;
    .locals 2

    .line 1
    iget v0, p0, Llg/b;->e:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Llg/b;->e:I

    .line 8
    .line 9
    new-instance v0, Llg/b$e;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Llg/b$e;-><init>(Llg/b;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string p2, "state: "

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget p2, p0, Llg/b;->e:I

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p2
.end method

.method private final x()Ltg/X;
    .locals 2

    .line 1
    iget v0, p0, Llg/b;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    iput v0, p0, Llg/b;->e:I

    .line 8
    .line 9
    new-instance v0, Llg/b$f;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Llg/b$f;-><init>(Llg/b;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "state: "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Llg/b;->e:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1
.end method

.method private final y()Ltg/Z;
    .locals 2

    .line 1
    iget v0, p0, Llg/b;->e:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Llg/b;->e:I

    .line 8
    .line 9
    invoke-virtual {p0}, Llg/b;->c()Ljg/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljg/f;->z()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Llg/b$g;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Llg/b$g;-><init>(Llg/b;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v1, "state: "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget v1, p0, Llg/b;->e:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method


# virtual methods
.method public final A(Ldg/t;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requestLine"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Llg/b;->e:I

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Llg/b;->d:Ltg/i;

    .line 16
    .line 17
    invoke-interface {v0, p2}, Ltg/i;->s0(Ljava/lang/String;)Ltg/i;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "\r\n"

    .line 22
    .line 23
    invoke-interface {p2, v0}, Ltg/i;->s0(Ljava/lang/String;)Ltg/i;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ldg/t;->size()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, p2, :cond_0

    .line 32
    .line 33
    iget-object v2, p0, Llg/b;->d:Ltg/i;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ldg/t;->f(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {v2, v3}, Ltg/i;->s0(Ljava/lang/String;)Ltg/i;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, ": "

    .line 44
    .line 45
    invoke-interface {v2, v3}, Ltg/i;->s0(Ljava/lang/String;)Ltg/i;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1, v1}, Ldg/t;->p(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v3}, Ltg/i;->s0(Ljava/lang/String;)Ltg/i;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2, v0}, Ltg/i;->s0(Ljava/lang/String;)Ltg/i;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object p1, p0, Llg/b;->d:Ltg/i;

    .line 64
    .line 65
    invoke-interface {p1, v0}, Ltg/i;->s0(Ljava/lang/String;)Ltg/i;

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    iput p1, p0, Llg/b;->e:I

    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string p2, "state: "

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget p2, p0, Llg/b;->e:I

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p2
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Llg/b;->d:Ltg/i;

    .line 2
    .line 3
    invoke-interface {v0}, Ltg/i;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ldg/C;)V
    .locals 3

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkg/i;->a:Lkg/i;

    .line 7
    .line 8
    invoke-virtual {p0}, Llg/b;->c()Ljg/f;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljg/f;->A()Ldg/G;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ldg/G;->b()Ljava/net/Proxy;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "connection.route().proxy.type()"

    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, v1}, Lkg/i;->a(Ldg/C;Ljava/net/Proxy$Type;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Ldg/C;->i()Ldg/t;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1, v0}, Llg/b;->A(Ldg/t;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public c()Ljg/f;
    .locals 1

    .line 1
    iget-object v0, p0, Llg/b;->b:Ljg/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public cancel()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Llg/b;->c()Ljg/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljg/f;->d()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(Ldg/E;)Ltg/Z;
    .locals 4

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkg/e;->b(Ldg/E;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-direct {p0, v0, v1}, Llg/b;->w(J)Ltg/Z;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-direct {p0, p1}, Llg/b;->t(Ldg/E;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Ldg/E;->F0()Ldg/C;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ldg/C;->p()Ldg/u;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Llg/b;->v(Ldg/u;)Ltg/Z;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-static {p1}, Lfg/e;->v(Ldg/E;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    const-wide/16 v2, -0x1

    .line 43
    .line 44
    cmp-long p1, v0, v2

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    invoke-direct {p0, v0, v1}, Llg/b;->w(J)Ltg/Z;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_2
    invoke-direct {p0}, Llg/b;->y()Ltg/Z;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method public e(Z)Ldg/E$a;
    .locals 4

    .line 1
    iget v0, p0, Llg/b;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x3

    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v0, "state: "

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v0, p0, Llg/b;->e:I

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    :goto_0
    :try_start_0
    sget-object v0, Lkg/k;->d:Lkg/k$a;

    .line 43
    .line 44
    iget-object v1, p0, Llg/b;->f:Llg/a;

    .line 45
    .line 46
    invoke-virtual {v1}, Llg/a;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lkg/k$a;->a(Ljava/lang/String;)Lkg/k;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Ldg/E$a;

    .line 55
    .line 56
    invoke-direct {v1}, Ldg/E$a;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object v3, v0, Lkg/k;->a:Ldg/B;

    .line 60
    .line 61
    invoke-virtual {v1, v3}, Ldg/E$a;->p(Ldg/B;)Ldg/E$a;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget v3, v0, Lkg/k;->b:I

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Ldg/E$a;->g(I)Ldg/E$a;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v3, v0, Lkg/k;->c:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Ldg/E$a;->m(Ljava/lang/String;)Ldg/E$a;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v3, p0, Llg/b;->f:Llg/a;

    .line 78
    .line 79
    invoke-virtual {v3}, Llg/a;->a()Ldg/t;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v1, v3}, Ldg/E$a;->k(Ldg/t;)Ldg/E$a;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const/16 v3, 0x64

    .line 88
    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    iget p1, v0, Lkg/k;->b:I

    .line 92
    .line 93
    if-ne p1, v3, :cond_2

    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    return-object p1

    .line 97
    :catch_0
    move-exception p1

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    iget p1, v0, Lkg/k;->b:I

    .line 100
    .line 101
    if-ne p1, v3, :cond_3

    .line 102
    .line 103
    iput v2, p0, Llg/b;->e:I

    .line 104
    .line 105
    return-object v1

    .line 106
    :cond_3
    const/16 v0, 0x66

    .line 107
    .line 108
    if-gt v0, p1, :cond_4

    .line 109
    .line 110
    const/16 v0, 0xc8

    .line 111
    .line 112
    if-ge p1, v0, :cond_4

    .line 113
    .line 114
    iput v2, p0, Llg/b;->e:I

    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_4
    const/4 p1, 0x4

    .line 118
    iput p1, p0, Llg/b;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    return-object v1

    .line 121
    :goto_1
    invoke-virtual {p0}, Llg/b;->c()Ljg/f;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Ljg/f;->A()Ldg/G;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ldg/G;->a()Ldg/a;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ldg/a;->l()Ldg/u;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ldg/u;->o()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    new-instance v1, Ljava/io/IOException;

    .line 142
    .line 143
    new-instance v2, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v3, "unexpected end of stream on "

    .line 149
    .line 150
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    throw v1
.end method

.method public f(Ldg/E;)J
    .locals 2

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkg/e;->b(Ldg/E;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    invoke-direct {p0, p1}, Llg/b;->t(Ldg/E;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-wide/16 v0, -0x1

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    invoke-static {p1}, Lfg/e;->v(Ldg/E;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    return-wide v0
.end method

.method public g(Ldg/C;J)Ltg/X;
    .locals 2

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldg/C;->e()Ldg/D;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ldg/C;->e()Ldg/D;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ldg/D;->d()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    .line 24
    .line 25
    const-string p2, "Duplex connections are not supported for HTTP/1"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Llg/b;->s(Ldg/C;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-direct {p0}, Llg/b;->u()Ltg/X;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_2
    const-wide/16 v0, -0x1

    .line 43
    .line 44
    cmp-long p1, p2, v0

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-direct {p0}, Llg/b;->x()Ltg/X;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Llg/b;->d:Ltg/i;

    .line 2
    .line 3
    invoke-interface {v0}, Ltg/i;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final z(Ldg/E;)V
    .locals 4

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lfg/e;->v(Ldg/E;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, -0x1

    .line 11
    .line 12
    cmp-long p1, v0, v2

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-direct {p0, v0, v1}, Llg/b;->w(J)Ltg/Z;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const v0, 0x7fffffff

    .line 22
    .line 23
    .line 24
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    invoke-static {p1, v0, v1}, Lfg/e;->M(Ltg/Z;ILjava/util/concurrent/TimeUnit;)Z

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ltg/Z;->close()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
