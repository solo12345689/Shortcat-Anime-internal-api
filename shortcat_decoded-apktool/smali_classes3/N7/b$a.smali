.class public final LN7/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LN7/a;

.field public final b:LN7/a;


# direct methods
.method public constructor <init>(LN7/a;LN7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN7/b$a;->a:LN7/a;

    .line 5
    .line 6
    iput-object p2, p0, LN7/b$a;->b:LN7/a;

    .line 7
    .line 8
    return-void
.end method
