.class Lfh/n$a;
.super Lfh/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final c:LHg/h;

.field private final d:LHg/h;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    const/16 v0, 0xa8

    .line 2
    .line 3
    const/16 v1, 0x88

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lfh/n;-><init>(II)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LHg/h;

    .line 9
    .line 10
    const/16 v1, 0x80

    .line 11
    .line 12
    invoke-direct {v0, v1}, LHg/h;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lfh/n$a;->c:LHg/h;

    .line 16
    .line 17
    new-instance v0, LHg/h;

    .line 18
    .line 19
    const/16 v1, 0x100

    .line 20
    .line 21
    invoke-direct {v0, v1}, LHg/h;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lfh/n$a;->d:LHg/h;

    .line 25
    .line 26
    return-void
.end method

.method private e(LHg/h;[BS)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LHg/b;->p()V

    .line 2
    .line 3
    .line 4
    int-to-byte v0, p3

    .line 5
    shr-int/lit8 p3, p3, 0x8

    .line 6
    .line 7
    int-to-byte p3, p3

    .line 8
    const/4 v1, 0x2

    .line 9
    new-array v2, v1, [B

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-byte v0, v2, v3

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    aput-byte p3, v2, v0

    .line 16
    .line 17
    array-length p3, p2

    .line 18
    invoke-virtual {p1, p2, v3, p3}, LHg/b;->update([BII)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v2, v3, v1}, LHg/b;->update([BII)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method a([BS)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/n$a;->c:LHg/h;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lfh/n$a;->e(LHg/h;[BS)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method b([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/n$a;->c:LHg/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LHg/h;->s([BII)I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method c([BS)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/n$a;->d:LHg/h;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lfh/n$a;->e(LHg/h;[BS)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method d([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/n$a;->d:LHg/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LHg/h;->s([BII)I

    .line 4
    .line 5
    .line 6
    return-void
.end method
