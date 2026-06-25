.class Ldh/q;
.super Ljava/lang/Object;


# instance fields
.field private final a:[B

.field private final b:[B

.field private final c:LFg/j;

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>([B[BLFg/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldh/q;->a:[B

    .line 5
    .line 6
    iput-object p2, p0, Ldh/q;->b:[B

    .line 7
    .line 8
    iput-object p3, p0, Ldh/q;->c:LFg/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a([BZ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Ldh/q;->b([BZI)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public b([BZI)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p3}, Ldh/q;->c([BI)[B

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget p1, p0, Ldh/q;->e:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Ldh/q;->e:I

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public c([BI)[B
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    sub-int/2addr v0, p2

    .line 3
    iget-object v1, p0, Ldh/q;->c:LFg/j;

    .line 4
    .line 5
    invoke-interface {v1}, LFg/j;->d()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 12
    .line 13
    iget-object v1, p0, Ldh/q;->a:[B

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-interface {v0, v1, v3, v2}, LFg/j;->update([BII)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 21
    .line 22
    iget v1, p0, Ldh/q;->d:I

    .line 23
    .line 24
    ushr-int/lit8 v1, v1, 0x18

    .line 25
    .line 26
    int-to-byte v1, v1

    .line 27
    invoke-interface {v0, v1}, LFg/j;->b(B)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 31
    .line 32
    iget v1, p0, Ldh/q;->d:I

    .line 33
    .line 34
    ushr-int/lit8 v1, v1, 0x10

    .line 35
    .line 36
    int-to-byte v1, v1

    .line 37
    invoke-interface {v0, v1}, LFg/j;->b(B)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 41
    .line 42
    iget v1, p0, Ldh/q;->d:I

    .line 43
    .line 44
    ushr-int/lit8 v1, v1, 0x8

    .line 45
    .line 46
    int-to-byte v1, v1

    .line 47
    invoke-interface {v0, v1}, LFg/j;->b(B)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 51
    .line 52
    iget v1, p0, Ldh/q;->d:I

    .line 53
    .line 54
    int-to-byte v1, v1

    .line 55
    invoke-interface {v0, v1}, LFg/j;->b(B)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 59
    .line 60
    iget v1, p0, Ldh/q;->e:I

    .line 61
    .line 62
    ushr-int/lit8 v1, v1, 0x8

    .line 63
    .line 64
    int-to-byte v1, v1

    .line 65
    invoke-interface {v0, v1}, LFg/j;->b(B)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 69
    .line 70
    iget v1, p0, Ldh/q;->e:I

    .line 71
    .line 72
    int-to-byte v1, v1

    .line 73
    invoke-interface {v0, v1}, LFg/j;->b(B)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 77
    .line 78
    const/4 v1, -0x1

    .line 79
    invoke-interface {v0, v1}, LFg/j;->b(B)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 83
    .line 84
    iget-object v1, p0, Ldh/q;->b:[B

    .line 85
    .line 86
    array-length v2, v1

    .line 87
    invoke-interface {v0, v1, v3, v2}, LFg/j;->update([BII)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Ldh/q;->c:LFg/j;

    .line 91
    .line 92
    invoke-interface {v0, p1, p2}, LFg/j;->a([BI)I

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 97
    .line 98
    const-string p2, "target length is less than digest size."

    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldh/q;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldh/q;->d:I

    .line 2
    .line 3
    return-void
.end method
