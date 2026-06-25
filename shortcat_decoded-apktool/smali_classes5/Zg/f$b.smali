.class LZg/f$b;
.super LZg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
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
    invoke-direct {p0, v0, v1}, LZg/f;-><init>(II)V

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
    iput-object v0, p0, LZg/f$b;->c:LHg/h;

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
    iput-object v0, p0, LZg/f$b;->d:LHg/h;

    .line 25
    .line 26
    return-void
.end method
