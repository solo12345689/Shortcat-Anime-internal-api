.class final Lexpo/modules/updates/UpdatesModule$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesModule;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lexpo/modules/updates/UpdatesModule$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/updates/UpdatesModule$e;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/updates/UpdatesModule$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/updates/UpdatesModule$e;->a:Lexpo/modules/updates/UpdatesModule$e;

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
.method public final a()V
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/updates/f;->a:Lexpo/modules/updates/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/updates/f;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/updates/UpdatesModule$e;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
