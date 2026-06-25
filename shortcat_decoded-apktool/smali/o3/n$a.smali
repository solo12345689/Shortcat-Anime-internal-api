.class final Lo3/n$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:Lo3/t;

.field public final b:Lo3/w;

.field public final c:LU2/O;

.field public final d:LU2/P;

.field public e:I


# direct methods
.method public constructor <init>(Lo3/t;Lo3/w;LU2/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo3/n$a;->a:Lo3/t;

    .line 5
    .line 6
    iput-object p2, p0, Lo3/n$a;->b:Lo3/w;

    .line 7
    .line 8
    iput-object p3, p0, Lo3/n$a;->c:LU2/O;

    .line 9
    .line 10
    iget-object p1, p1, Lo3/t;->g:Lq2/x;

    .line 11
    .line 12
    iget-object p1, p1, Lq2/x;->o:Ljava/lang/String;

    .line 13
    .line 14
    const-string p2, "audio/true-hd"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p1, LU2/P;

    .line 23
    .line 24
    invoke-direct {p1}, LU2/P;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    iput-object p1, p0, Lo3/n$a;->d:LU2/P;

    .line 30
    .line 31
    return-void
.end method
