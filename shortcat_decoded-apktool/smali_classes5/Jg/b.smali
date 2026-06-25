.class public LJg/b;
.super LFg/o;

# interfaces
.implements LJg/a;


# instance fields
.field private final b:LFg/a;

.field private final c:I

.field private d:[B

.field private e:[B

.field private f:[B

.field private g:I


# direct methods
.method public constructor <init>(LFg/a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LFg/o;-><init>(LFg/a;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJg/b;->b:LFg/a;

    .line 5
    .line 6
    invoke-interface {p1}, LFg/a;->a()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, LJg/b;->c:I

    .line 11
    .line 12
    new-array v0, p1, [B

    .line 13
    .line 14
    iput-object v0, p0, LJg/b;->d:[B

    .line 15
    .line 16
    new-array v0, p1, [B

    .line 17
    .line 18
    iput-object v0, p0, LJg/b;->e:[B

    .line 19
    .line 20
    new-array p1, p1, [B

    .line 21
    .line 22
    iput-object p1, p0, LJg/b;->f:[B

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput p1, p0, LJg/b;->g:I

    .line 26
    .line 27
    return-void
.end method

.method public static b(LFg/a;)LJg/a;
    .locals 1

    .line 1
    new-instance v0, LJg/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LJg/b;-><init>(LFg/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, LJg/b;->b:LFg/a;

    .line 2
    .line 3
    invoke-interface {v0}, LFg/a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
