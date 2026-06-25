.class public final Ljg/f$e;
.super Lsg/d$d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljg/f;->x(Ljg/c;)Lsg/d$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Ljg/c;


# direct methods
.method constructor <init>(Ltg/j;Ltg/i;Ljg/c;)V
    .locals 0

    .line 1
    iput-object p3, p0, Ljg/f$e;->d:Ljg/c;

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    invoke-direct {p0, p3, p1, p2}, Lsg/d$d;-><init>(ZLtg/j;Ltg/i;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public close()V
    .locals 6

    .line 1
    iget-object v0, p0, Ljg/f$e;->d:Ljg/c;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual/range {v0 .. v5}, Ljg/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    .line 9
    .line 10
    .line 11
    return-void
.end method
