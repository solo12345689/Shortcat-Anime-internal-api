.class Lm1/d$b;
.super Lm1/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Lm1/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm1/j;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lm1/j;-><init>(Lm1/b;Lm1/c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm1/b;->e:Lm1/b$a;

    .line 10
    .line 11
    return-void
.end method
