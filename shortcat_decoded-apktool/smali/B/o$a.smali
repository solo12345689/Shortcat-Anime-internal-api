.class public final LB/o$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LB/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LB/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LB/o$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB/o$a;->a:LB/o$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()LB/o$b;
    .locals 1

    .line 1
    iget-object v0, p0, LB/o$a;->a:LB/o$b;

    .line 2
    .line 3
    return-object v0
.end method
