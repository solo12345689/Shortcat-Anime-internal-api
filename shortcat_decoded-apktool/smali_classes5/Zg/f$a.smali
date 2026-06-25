.class LZg/f$a;
.super LZg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final c:LFg/p;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-direct {p0, v0, v0}, LZg/f;-><init>(II)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LIg/a;->k()LFg/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LJg/b;->b(LFg/a;)LJg/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LZg/f$a;->c:LFg/p;

    .line 15
    .line 16
    return-void
.end method
