.class public LKh/b;
.super LKh/a;


# instance fields
.field private c:I

.field private d:I

.field private e:LMh/b;

.field private f:LMh/i;

.field private g:LMh/h;

.field private h:LMh/a;

.field private i:[LMh/i;


# direct methods
.method public constructor <init>(IILMh/b;LMh/i;LMh/a;LMh/h;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0, p7}, LKh/a;-><init>(ZLjava/lang/String;)V

    iput p1, p0, LKh/b;->c:I

    iput p2, p0, LKh/b;->d:I

    iput-object p3, p0, LKh/b;->e:LMh/b;

    iput-object p4, p0, LKh/b;->f:LMh/i;

    iput-object p5, p0, LKh/b;->h:LMh/a;

    iput-object p6, p0, LKh/b;->g:LMh/h;

    new-instance p1, LMh/k;

    invoke-direct {p1, p3, p4}, LMh/k;-><init>(LMh/b;LMh/i;)V

    invoke-virtual {p1}, LMh/k;->c()[LMh/i;

    move-result-object p1

    iput-object p1, p0, LKh/b;->i:[LMh/i;

    return-void
.end method

.method public constructor <init>(IILMh/b;LMh/i;LMh/h;Ljava/lang/String;)V
    .locals 8

    .line 2
    invoke-static {p3, p4}, LMh/c;->a(LMh/b;LMh/i;)LMh/a;

    move-result-object v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LKh/b;-><init>(IILMh/b;LMh/i;LMh/a;LMh/h;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c()LMh/b;
    .locals 1

    .line 1
    iget-object v0, p0, LKh/b;->e:LMh/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LMh/i;
    .locals 1

    .line 1
    iget-object v0, p0, LKh/b;->f:LMh/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, LKh/b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, LKh/b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public g()LMh/h;
    .locals 1

    .line 1
    iget-object v0, p0, LKh/b;->g:LMh/h;

    .line 2
    .line 3
    return-object v0
.end method
