.class Lmh/g$a;
.super Lmh/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmh/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:LHg/d;

.field private final b:LHg/g;

.field private final c:LFg/p;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lmh/g;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LHg/d;

    .line 5
    .line 6
    invoke-direct {v0}, LHg/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lmh/g$a;->a:LHg/d;

    .line 10
    .line 11
    new-instance v0, LHg/g;

    .line 12
    .line 13
    invoke-direct {v0}, LHg/g;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lmh/g$a;->b:LHg/g;

    .line 17
    .line 18
    invoke-static {}, LIg/a;->k()LFg/k;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, LJg/b;->b(LFg/a;)LJg/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lmh/g$a;->c:LFg/p;

    .line 27
    .line 28
    return-void
.end method
