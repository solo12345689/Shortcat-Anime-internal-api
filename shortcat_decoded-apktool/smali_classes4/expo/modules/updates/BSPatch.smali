.class public final Lexpo/modules/updates/BSPatch;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0087 \u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/updates/BSPatch;",
        "",
        "<init>",
        "()V",
        "applyPatch",
        "",
        "oldFilePath",
        "",
        "newFilePath",
        "patchFilePath",
        "expo-updates_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lexpo/modules/updates/BSPatch;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/updates/BSPatch;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/updates/BSPatch;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/updates/BSPatch;->a:Lexpo/modules/updates/BSPatch;

    .line 7
    .line 8
    const-string v0, "expo-updates"

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final native applyPatch(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
.end method
