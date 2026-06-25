.class abstract LHg/i;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHg/i$a;,
        LHg/i$b;
    }
.end annotation


# direct methods
.method static a(LFg/j;ILFg/d;)LFg/c;
    .locals 2

    .line 1
    new-instance v0, LHg/i$b;

    .line 2
    .line 3
    invoke-interface {p0}, LFg/j;->d()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-int/lit8 v1, v1, 0x4

    .line 8
    .line 9
    invoke-interface {p0}, LFg/j;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, v1, p1, p0, p2}, LHg/i$b;-><init>(IILjava/lang/String;LFg/d;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method static b(LFg/j;LFg/d;)LFg/c;
    .locals 2

    .line 1
    new-instance v0, LHg/i$a;

    .line 2
    .line 3
    invoke-interface {p0}, LFg/j;->d()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-int/lit8 v1, v1, 0x4

    .line 8
    .line 9
    invoke-interface {p0}, LFg/j;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, v1, p0, p1}, LHg/i$a;-><init>(ILjava/lang/String;LFg/d;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
