.class public final LY4/e$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LY4/e$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/e$c$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LY4/e$c$a;-><init>(LY4/e$c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LY4/e$c;->a:LY4/e$a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public d(LY4/r;)LY4/n;
    .locals 1

    .line 1
    new-instance p1, LY4/e;

    .line 2
    .line 3
    iget-object v0, p0, LY4/e$c;->a:LY4/e$a;

    .line 4
    .line 5
    invoke-direct {p1, v0}, LY4/e;-><init>(LY4/e$a;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
