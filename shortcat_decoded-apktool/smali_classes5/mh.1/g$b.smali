.class Lmh/g$b;
.super Lmh/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmh/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:LHg/f;

.field private final b:LHg/f;

.field private final c:LFg/q;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lmh/g;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LHg/h;

    .line 5
    .line 6
    const/16 v1, 0x80

    .line 7
    .line 8
    invoke-direct {v0, v1}, LHg/h;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lmh/g$b;->c:LFg/q;

    .line 12
    .line 13
    new-instance v0, LHg/f;

    .line 14
    .line 15
    const/16 v1, 0x100

    .line 16
    .line 17
    invoke-direct {v0, v1}, LHg/f;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lmh/g$b;->a:LHg/f;

    .line 21
    .line 22
    new-instance v0, LHg/f;

    .line 23
    .line 24
    const/16 v1, 0x200

    .line 25
    .line 26
    invoke-direct {v0, v1}, LHg/f;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lmh/g$b;->b:LHg/f;

    .line 30
    .line 31
    return-void
.end method
