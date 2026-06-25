.class public final LY/s$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/z1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LY/s$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/s$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/s$a;->a:LY/s$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()LY/s$b;
    .locals 1

    .line 1
    iget-object v0, p0, LY/s$a;->a:LY/s$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s$a;->a:LY/s$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/s$b;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/s$a;->a:LY/s$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/s$b;->w()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
