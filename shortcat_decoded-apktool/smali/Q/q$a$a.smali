.class final LQ/q$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ/q$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LQ/q$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQ/q$a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LQ/q$a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ/q$a$a;->a:LQ/q$a$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(LQ/j;I)J
    .locals 0

    .line 1
    invoke-virtual {p1}, LQ/j;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p2}, LK/C;->c(Ljava/lang/CharSequence;I)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method
